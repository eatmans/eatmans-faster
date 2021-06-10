package com.eatmans.faster.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/9
 */
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private String phone;

    private int loginTime;

    private Date createTime;

    private Date updateTime;
}
