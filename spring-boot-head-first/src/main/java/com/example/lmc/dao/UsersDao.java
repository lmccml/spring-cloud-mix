package com.example.lmc.dao;

import com.example.lmc.entity.UserInfo;
import com.example.lmc.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lmc
 * @date 2020/8/3 0:01
 */
public interface UsersDao extends JpaRepository<UserInfoEntity, Integer> {

}
