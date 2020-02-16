package com.lx;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/***
 * create by chenjiang on 2020/2/9 0009
 * <p>
 *     项目启动入口
 * </p>
 */
@SuppressWarnings("all")
@EnableDubboConfig
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@DubboComponentScan("com.lx.app.api")
@ImportResource(locations = {"classpath:dubbo.xml"})
@ComponentScan(basePackages = {"com.codingapi.tx.*", "com.lx.*"})
public class Start extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
        System.out.println("启动成功");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Start.class);
    }
}
