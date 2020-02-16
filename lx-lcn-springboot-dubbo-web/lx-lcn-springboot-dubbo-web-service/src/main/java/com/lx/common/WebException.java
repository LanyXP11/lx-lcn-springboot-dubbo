package com.lx.common;


import com.lx.consts.ErrorCodeEnum;

/***
 * create by chenjiang on 2020/2/9 0009
 */
public class WebException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private Integer code = Integer.valueOf(ErrorCodeEnum.系统异常.getCode());

    public WebException() {
    }

    public WebException(String message) {
        super(message);
    }

    public WebException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public WebException(String message, Throwable cause) {
        super(message, cause);
    }

    public Integer getCode() {
        return this.code;
    }
}
