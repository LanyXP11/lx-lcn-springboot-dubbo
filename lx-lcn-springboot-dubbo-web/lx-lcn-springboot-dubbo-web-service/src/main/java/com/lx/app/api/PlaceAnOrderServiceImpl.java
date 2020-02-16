package com.lx.app.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.BaseResult;
import com.lx.interfaces.PlaceAnOrderService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Service
@Slf4j
@SuppressWarnings("all")
public class PlaceAnOrderServiceImpl implements PlaceAnOrderService {


    @Override
    public BaseResult dubborequest(Map map) {
        return null;
    }
}
