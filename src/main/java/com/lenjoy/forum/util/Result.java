package com.lenjoy.forum.util;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final Long serialVersionUID = 1L;

    private int ResultCode;

    private String message;

    private T data;

    public Result() {
    }

    public Result(int resultCode, String message) {
        ResultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "ResultCode=" + ResultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
