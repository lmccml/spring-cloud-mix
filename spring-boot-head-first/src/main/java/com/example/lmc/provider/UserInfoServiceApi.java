package com.example.lmc.provider;

import com.example.lmc.entity.UserInfo;

import java.util.List;

/**
 * @author lmc
 * @date 2020/8/2 14:59
 */
public interface UserInfoServiceApi {

    List<UserInfo> getUserInfo();

    Integer addUserInfo(UserInfo userInfo);

}
