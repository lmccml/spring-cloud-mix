package com.example.lmc.service;

import com.example.lmc.dao.IUserInfoDao;
import com.example.lmc.entity.UserInfo;
import com.example.lmc.provider.UserInfoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lmc
 * @date 2020/8/2 14:51
 */
@Service
public class UserInfoService implements UserInfoServiceApi {

    @Autowired
    private IUserInfoDao iUserInfoDao;

    public List<UserInfo> getUserInfo() {
        return iUserInfoDao.findAllList(null);
    }

    public Integer addUserInfo(UserInfo userInfo) {
        return iUserInfoDao.add(userInfo);
    }
}
