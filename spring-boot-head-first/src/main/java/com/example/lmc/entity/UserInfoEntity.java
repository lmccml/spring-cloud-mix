package com.example.lmc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lmc
 * @description 用户信息
 * @date 2020-08-03
 */
@Entity
@NoArgsConstructor
@ToString
@Data
@Table(name = "user_info")
public class UserInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    /**
     * id
     */
    @Column(name = "id")
    private Integer id;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 手机
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 状态：1-有效，0-无效
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 性别：0-男，1-女
     */
    @Column(name = "sex")
    private Integer sex;

    /**
     * 生日 ：yyyy-mm-dd
     */
    @Column(name = "birthday")
    private String birthday;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @Column(name = "create_time")
    private String createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @Column(name = "update_time")
    private String updateTime;

}
