package com.example.lmc.controller;

import com.example.lmc.common.ResultEnum;
import com.example.lmc.common.ResultT;
import com.example.lmc.entity.UserInfo;
import com.example.lmc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

/**
 * @author lmc
 * @date 2020/8/2 14:54
 */
@RestController

public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/user/add")
    public ResultT<Boolean> addUserInfo(@RequestBody UserInfo userInfo) {
        Integer i = userInfoService.addUserInfo(userInfo);
        if (i > 0) {
            return ResultT.success(true);
        }
        return ResultT.error(ResultEnum.DATA_ADD);
    }


}
