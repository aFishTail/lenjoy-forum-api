package com.lenjoy.forum.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Post {
    private Long id;

    private String title;

    private String description;

    private String content;

    private Long categoryId;

    private String coverImg;

    private String tag;

    private Byte status;

    private Integer createUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Integer updateUser;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
