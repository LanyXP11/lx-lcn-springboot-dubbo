package com.lx.app.controller;

import com.lx.BaseResult;

import com.lx.common.WebException;
import com.lx.dal.entity.Goods;
import com.lx.dal.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@RestController
public class LcnTestContrioller {
    @Autowired
    private GoodsService goodsService;

    @PostMapping("/test/lcn")
    public Object request(@RequestBody Map requestMap) {
        if (requestMap.isEmpty()) {
            throw new WebException(21001, "参数不能为空");
        }
        String goodName = String.valueOf(requestMap.getOrDefault("goodName", ""));
        Goods goods = new Goods(goodName);
        goodsService.addGoods(goods);
        return new BaseResult();
    }
}
