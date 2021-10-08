package com.dodear.userservice.controller;


import com.dodear.userservice.entity.TabUser;
import com.dodear.userservice.service.TabUserService;
import com.dodear.commonutils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-01
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户模块")
public class TabUserController {

    @Autowired
    private TabUserService tabUserService;

    /**
     * 根据用户电话查询唯一用户
     * @param tel
     * @return
     */
    @GetMapping("/find/{tel}")
    @ApiOperation(value = "根据用户电话查唯一用户")
    public Result FindOneByTel(@PathVariable String tel) {
        TabUser tabUser = tabUserService.FindOneByTel(tel);
        if (tabUser!=null){
            return Result.ok().data("tabUser",tabUser);
        }else {
            return Result.error().message("未找到此用户");
        }

    }

    /**
     * 添加用户到数据库
     * @param tabUser
     * @return
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加用户到数据库")
    public Result AddOneUser(@RequestBody TabUser tabUser){
        Boolean flag = tabUserService.AddOneUser(tabUser);
        if (flag){
            return Result.ok();
        }else {
            return Result.error().message("用户注册失败");
        }
    }



}

