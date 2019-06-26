package com.zlp.admin.controller;

import com.zlp.admin.dto.UmsAdminParam;
import com.zlp.admin.service.UmsAdminService;
import com.zlp.common.CommonResult;
import com.zlp.mbg.model.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "UmsAdmin", description = "UmsAdmin")
@RestController
public class UmsAdminController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UmsAdminService adminService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/admin/register")
    @ResponseBody
    public CommonResult<UmsAdmin> register(
            @RequestBody UmsAdminParam umsAdminParam, BindingResult result
            ){
            UmsAdmin umsAdmin = adminService.register(umsAdminParam);
            if(umsAdmin == null){
                CommonResult.failed();
            }
            return CommonResult.success(umsAdmin);
    }
}
