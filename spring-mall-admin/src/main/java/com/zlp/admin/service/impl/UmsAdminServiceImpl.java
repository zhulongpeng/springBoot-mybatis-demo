package com.zlp.admin.service.impl;

import com.zlp.admin.dto.UmsAdminParam;
import com.zlp.admin.service.UmsAdminService;
import com.zlp.mbg.mapper.UmsAdminMapper;
import com.zlp.mbg.model.UmsAdmin;
import com.zlp.mbg.model.UmsAdminExample;
import com.zlp.mbg.model.UmsPermission;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.List;

public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper adminMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if(umsAdminList.size() > 0){
            return null;
        }
        //将密码进行加密
        umsAdmin.setPassword(passwordEncoder.encode(umsAdmin.getPassword()));
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if(adminList != null && adminList.size() > 0){
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}
