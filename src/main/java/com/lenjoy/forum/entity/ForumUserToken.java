package com.lenjoy.forum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ForumUserToken {
    private Long userId;

    private String token;

    private Date updateTime;

    private Date expireTime;
}
