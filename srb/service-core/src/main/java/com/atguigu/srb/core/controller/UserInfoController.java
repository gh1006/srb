package com.atguigu.srb.core.controller;


import com.atguigu.srb.core.pojo.entity.UserInfo;
import com.atguigu.srb.core.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户基本信息 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2021-04-27
 */
@RestController
@RequestMapping("/userInfo")
@CrossOrigin //解决跨域问题
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/list")
    @ResponseBody
    public List<UserInfo> getUserInfo(){
        return  userInfoService.list();
    }
}

