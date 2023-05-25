package com.lenjoy.forum.common;

public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("SUCCESS"),

    LOGIN_ERROR("登录失败！"),

    NOT_LOGIN_ERROR("未登录！"),

    ADMIN_NOT_LOGIN_ERROR("管理员未登录！"),

    TOKEN_EXPIRE_ERROR("无效认证！请重新登录！"),

    ADMIN_TOKEN_EXPIRE_ERROR("管理员登录过期！请重新登录！"),

    USER_NULL_ERROR("无效用户！请重新登录！"),

    LOGIN_USER_LOCKED_ERROR("用户已被禁止登录");


    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    ;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
