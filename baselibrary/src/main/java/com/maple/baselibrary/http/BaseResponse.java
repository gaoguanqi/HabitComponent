package com.maple.baselibrary.http;

/**
 * Created by goldze on 2017/5/10.
 * 该类仅供参考，实际业务返回的固定字段, 根据需求来定义，
 */
public class BaseResponse<T> {
    private int errorCode;
    private String errorMsg;
    private T data;

    public int getCode() {
        return errorCode;
    }

    public void setCode(int code) {
        this.errorCode = code;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return errorCode == 0;
    }

    public String getMessage() {
        return errorMsg;
    }

    public void setMessage(String message) {
        this.errorMsg = message;
    }
}
