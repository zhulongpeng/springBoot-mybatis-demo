package com.zlp.springbootmybatisdemo.business.controller;


import com.zlp.springbootmybatisdemo.base.util.ResResult;
import com.zlp.springbootmybatisdemo.business.model.modelVM.UserVM;
import com.zlp.springbootmybatisdemo.business.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "user", description = "user操作接口")
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @ApiOperation("登录")
    @PostMapping("/v1/user/login")
    @ResponseBody
    public ResResult<UserVM> login(
            @ApiParam(name = "userName", value = "用户名")@RequestParam(value = "userName")String userName,
            @ApiParam(name = "password", value = "密码")@RequestParam(value = "password")String password
    ){
        ResResult<UserVM> result = new ResResult<>();
        try {
            result.success(userService.doLogin(userName, password));
        } catch (Exception e) {
            result.error(e.getMessage());
        }
        return result;
    }

}
