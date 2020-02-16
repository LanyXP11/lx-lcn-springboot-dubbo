package com.lx.dal.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class Order {

    public Order() {
    }

    public Order(String code) {
        this.orderid = UUID.randomUUID().toString().replace("-", "");
        this.code = code;
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    private String orderid;

    private String code;

    private Date createTime;

    private Date updateTime;


}