package com.example.lmc.dao;

import com.example.lmc.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * @description 用户信息
 * @author lmc
 * @date 2020-08-02
 */
public interface IUserInfoDao {

    int add(UserInfo userInfo);

    int update(UserInfo userInfo);

    int delete(int id);

    UserInfo findById(int id);

    List<UserInfo> findAllList(Map<String,Object> param);

}
