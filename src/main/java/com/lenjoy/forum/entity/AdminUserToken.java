package com.lenjoy.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AdminUserToken {
    private Long id;

    private String token;

    private Date updateTime;

    private Date expireTime;
}
