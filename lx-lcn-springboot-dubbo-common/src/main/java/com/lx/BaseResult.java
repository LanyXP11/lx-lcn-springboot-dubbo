package com.lx;

import java.io.Serializable;

/***
 * create by chenjiang on 2020/2/9 0009
 */
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = -5512178961566392313L;
    private final static String OK_MESSAGE = "OK";

    private int code = 200;
    private String message;
    private T data;

    public BaseResult() {
        super();
        this.code = 200;
        this.message = OK_MESSAGE;
    }

    public BaseResult(T data) {
        super();
        this.data = data;
        this.code = 200;
        this.message = OK_MESSAGE;
    }

    public BaseResult(T data, int code, String message) {
        super();
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
        return "BaseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
