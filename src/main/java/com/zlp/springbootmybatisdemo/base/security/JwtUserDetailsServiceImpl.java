package com.zlp.springbootmybatisdemo.base.security;

import com.sun.tools.javac.util.List;
import com.zlp.springbootmybatisdemo.business.dao.RoleMapper;
import com.zlp.springbootmybatisdemo.business.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService  {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userMapper.selectByUserName(userName);
        List<String> roleList = roleMapper.findByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", userName));
        } else{
            return new JwtUserDetails(user.getUsername(), user.getPassword(), roleList.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
        }
        return null;
    }
}
