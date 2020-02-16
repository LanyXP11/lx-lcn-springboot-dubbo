package com.lx.dal.service.impl;

import com.alibaba.fastjson.JSON;
import com.codingapi.tx.annotation.TxTransaction;
import com.lx.BaseResult;
import com.lx.dal.entity.Goods;
import com.lx.dal.mapper.GoodsMapper;

import com.lx.dal.service.GoodsService;
import com.lx.interfaces.OrderDubboServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Service(value = "goodsServiceImpl")
@Slf4j
@SuppressWarnings("all")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private OrderDubboServcie orderDubboServcie;


    /**
     * TxTransaction使用的是LCN 定义的注解isStart=true 代表的是该服务是事务的发起方
     * Transactional使用的是spring提供的注解控制本地事务
     *
     * @param goods
     * @return
     */
    @Transactional(rollbackFor = RuntimeException.class)
    @TxTransaction(isStart = true)
    @Override
    public int addGoods(Goods goods) {
        //本地添加商品 本地控制事务
        int result = goodsMapper.insert(goods);
        //测试分布式事务
        Map requestMap = new HashMap();
        requestMap.put("code", UUID.randomUUID().toString().replace("-", ""));
        //外部dubbo服务
        BaseResult dubboResult = orderDubboServcie.orderInsert(requestMap);
        log.info("result:{}", JSON.toJSONString(dubboResult));

        return result;
    }
}
