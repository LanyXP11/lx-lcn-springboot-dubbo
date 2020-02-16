package com.lx.config;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lx.BaseResult;
import com.lx.common.WebException;

import com.lx.consts.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@ControllerAdvice
@Slf4j
public class DubboExceptionHandler {


    @ExceptionHandler(value = {WebException.class})
    @ResponseBody
    public ResponseEntity OSSExceptionHandler(WebException ex) {
        log.error(ex.toString());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json; charset=UTF-8");
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(ex.getCode());
        baseResult.setMessage(ex.getMessage());
        return new ResponseEntity<String>(JSONObject.toJSONString(baseResult, SerializerFeature.DisableCircularReferenceDetect), responseHeaders, HttpStatus.OK);

    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public ResponseEntity ExceptionHandler(Exception ex) {
        log.error(ex.toString());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json; charset=UTF-8");
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(ErrorCodeEnum.系统异常.getCode());
        baseResult.setMessage(ex.toString());
        return new ResponseEntity<String>(JSONObject.toJSONString(baseResult, SerializerFeature.DisableCircularReferenceDetect), responseHeaders, HttpStatus.OK);
    }

}
