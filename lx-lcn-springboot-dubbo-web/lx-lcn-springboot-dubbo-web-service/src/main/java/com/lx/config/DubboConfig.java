package com.lx.config;

import com.alibaba.dubbo.config.spring.ReferenceBean;

import com.lx.consts.Commonsts;
import com.lx.interfaces.OrderDubboServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Configuration
@Slf4j
@SuppressWarnings("all")
public class DubboConfig {
    private <T> ReferenceBean<T> createReferenceBean(Class<T> interfanceclass) {
        ReferenceBean referenceBean = new ReferenceBean();
        referenceBean.setInterface(interfanceclass);
        referenceBean.setCheck(false);
        referenceBean.setOwner(Commonsts.DUBO_OWNER);
        referenceBean.setTimeout(Commonsts.DUBO_TIME);
        referenceBean.setGroup(Commonsts.DUBO_GROUP);
        referenceBean.setVersion(Commonsts.DUBO_VERSION);
        return referenceBean;
    }

    @Bean
    public ReferenceBean<OrderDubboServcie> orderDubboServcie() {
        return this.createReferenceBean(OrderDubboServcie.class);

    }
}
