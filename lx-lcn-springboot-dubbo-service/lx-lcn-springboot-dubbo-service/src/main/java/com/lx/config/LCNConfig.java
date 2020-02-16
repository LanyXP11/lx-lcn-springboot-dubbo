package com.lx.config;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/***
 * create by chenjiang on 2020/2/9 0009
 */
@Configuration
@Slf4j
public class LCNConfig implements TxManagerTxUrlService {
    @Value("${tx.manager.url}")
    private String txUrl;

    @Bean("transactionManager")
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Override
    public String getTxUrl() {
        return txUrl;
    }
}
