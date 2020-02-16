
a.tx-manager 

LCN 分布式事务协调器 下载地址:

创建zip安装包

`mvn clean install `

b.先启动tx-manager之前
#zookeeper地址
spring.cloud.zookeeper.connect-string=本地地址
#redis主机地址 集群和单机
spring.redis.host=本地地址

c.启动lx-lcn-springboot-web项目
d.启动lx-lcn-springboot-service项目
e.访问地址
localhost:8999/test/lcn 参数：{"goodName":"XXXXX""}

# 注意点
项目基于SpringBoot2.0.4.RELEASE + Dubbo2.6.1 + Mybatis 2.0.0
分布式事务管理器tx-manager(4.1.0) 基于SpringBoot1.5.4.RELEASE  + Dubbo2.5.4 
经测试dubbo版本可兼容 

