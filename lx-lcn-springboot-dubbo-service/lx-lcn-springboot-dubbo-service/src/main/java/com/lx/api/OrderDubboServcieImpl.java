package com.lx.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.lx.BaseResult;
import com.lx.dal.entity.Order;
import com.lx.dal.mapper.OrderMapper;
import com.lx.interfaces.OrderDubboServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/***
 * create by chenjiang on 2020/2/12 0012
 */
@Service
@Slf4j
@SuppressWarnings("all")
public class OrderDubboServcieImpl implements OrderDubboServcie {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseResult orderInsert(Map map) {
        this.orderMapper.insert(new Order(String.valueOf(map.getOrDefault("code", ""))));
        return new BaseResult();
    }
}
