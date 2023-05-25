package com.lenjoy.forum.entity;

import lombok.Data;

@Data
public class AdminUser {
    private Long id;

    private String loginUserName;

    private String loginPassword;

    private String nickName;

    private Byte locked;
}
