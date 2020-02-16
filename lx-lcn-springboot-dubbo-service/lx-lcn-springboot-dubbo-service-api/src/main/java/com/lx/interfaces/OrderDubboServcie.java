package com.lx.interfaces;

import com.lx.BaseResult;

import java.util.Map;

/***
 * create by chenjiang on 2020/2/10 0010
 */
public interface OrderDubboServcie {
    /**
     * 添加订单
     *
     * @param map
     * @return
     */
    BaseResult orderInsert(Map map);
}
