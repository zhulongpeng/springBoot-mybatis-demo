package com.zlp.springbootmybatisdemo.business.service;

import com.zlp.springbootmybatisdemo.business.model.modelVM.UserVM;

public interface UserService {

    UserVM doLogin(String userName, String password);
}
