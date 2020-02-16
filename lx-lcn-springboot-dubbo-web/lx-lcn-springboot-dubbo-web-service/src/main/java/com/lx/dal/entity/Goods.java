package com.lx.dal.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Setter
@Getter
public class Goods {
    public Goods(String name) {
        this.gid = UUID.randomUUID().toString().replace("-", "");
        this.name = name;
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    private String gid;

    private String name;

    private Date createTime;

    private Date updateTime;
}
