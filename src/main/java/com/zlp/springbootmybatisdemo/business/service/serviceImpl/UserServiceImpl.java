package com.zlp.springbootmybatisdemo.business.service.serviceImpl;

import com.zlp.springbootmybatisdemo.base.security.JwtTokenUtil;
import com.zlp.springbootmybatisdemo.base.security.JwtUserDetailsServiceImpl;
import com.zlp.springbootmybatisdemo.business.dao.UserMapper;
import com.zlp.springbootmybatisdemo.business.entity.User;
import com.zlp.springbootmybatisdemo.business.model.modelVM.UserVM;
import com.zlp.springbootmybatisdemo.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public UserVM doLogin(String userName, String password) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userName, password);
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        String token = jwtTokenUtil.generateToken(userDetails);
        if(StringUtils.isEmpty(token))return null;
        User user =  findUserByUserName(userName);



    }

}
