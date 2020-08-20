package com.example.lmc.dao.impl;

import com.example.lmc.dao.IUserInfoDao;
import com.example.lmc.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description 用户信息
 * @author lmc
 * @date 2020-08-02
 */
@Repository
public class UserInfoDaoImpl implements IUserInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(UserInfo userInfo) {
        return jdbcTemplate.update("insert into user_info  (id,name,phone,status,sex,birthday,address,create_time,update_time ) values (?,?,?,?,?,?,?,?,? )",
                userInfo.getId(),userInfo.getName(),userInfo.getPhone(),userInfo.getStatus(),userInfo.getSex(),userInfo.getBirthday(),userInfo.getAddress(),userInfo.getCreateTime(),userInfo.getUpdateTime());
    }

    @Override
    public int update(UserInfo userInfo) {
        return jdbcTemplate.update("UPDATE  user_info  SET name=?,phone=?,status=?,sex=?,birthday=?,address=?,create_time=?,update_time=?"
                        +" where id=?",
                userInfo.getName(),userInfo.getPhone(),userInfo.getStatus(),userInfo.getSex(),userInfo.getBirthday(),userInfo.getAddress(),userInfo.getCreateTime(),userInfo.getUpdateTime(),
                userInfo.getId())
                ;
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from user_info where id=?",id);
    }

    @Override
    public UserInfo findById(int id) {
        List<UserInfo> list = jdbcTemplate.query("select * from user_info where id=?", new Object[]{id}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        if(list!=null && list.size()>0){
            UserInfo userInfo = list.get(0);
            return userInfo;
        }else{
            return null;
        }
    }

    @Override
    public List<UserInfo> findAllList(Map<String,Object> params) {
        List<UserInfo> list = jdbcTemplate.query("select * from user_info", new Object[]{}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

}
