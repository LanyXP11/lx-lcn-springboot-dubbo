package com.lx.consts;
/**
 * 
 * @author pc 系统异常处理
 *
 */
public enum ErrorCodeEnum {
	  系统异常,
	  系统提醒, 
	  系统提示刷新, 
	  系统提示, 
	  参数异常, 
	  参数丢失, 
	  参数不为空, 
	  非法参数;
		
	  private int code;
	  private String message;

	  public int getCode()
	  {
	    return this.code;
	  }

	  public void setCode(int code) {
	    this.code = code;
	  }

	  public String getMessage() {
	    return this.message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	  public static boolean contain(Integer value) {
	    if (value == null) {
	      return false;
	    }
	    ErrorCodeEnum[] values = values();
	    for (ErrorCodeEnum sexEnum : values) {
	      if (sexEnum.code == value.intValue()) {
	        return true;
	      }
	    }
	    return false;
	  }
}
