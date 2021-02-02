## little-egg 项目简介 
```$xslt
- little-egg是Java语言的分布式系统架构。 使用Spring整合开源框架。
- 使用Maven对项目进行模块化管理，提高项目的易开发性、扩展性。
- 系统包括3个子系统：egg-provider、 egg-provider2、 egg-consumer
- 可以无限的扩展子系统，子系统之间使用Dubbo或MQ进行通信。
- 闲来无事整合的玩的项目 :)
```

### 技术选型
```$xslt
 ● 核心框架：Spring boot + Spring Framework + Dubbo + activiti + rabbitmq
 ● 安全框架：
 ● 任务调度：Quartz
 ● 持久层框架：MyBatis + MyBatis-Plus
 ● 数据库连接池：H2
 ● 缓存框架：Redis
 ● 会话管理：
 ● 日志管理：Logback
 ● 前端框架：
 ● API交互框架：swagger      
 ● Java实用工具: Lombok
```

### 启动步骤
```$xslt
1、zookeerper.server、redis.server、rabbitmq.server
2、EggProvider2Application.java
3、EggProviderApplication.java
4、EggConsumerApplication.java
```

### Other
```$xslt
只整合activiti-spring-boot-starter-basic内容， 想要画图、部署操作目前在另一套开源项目上（加汉化、数据库为mysql） ↓
```

### 友情链接
[activiti-explorer-5.22.0(汉化版)](https://github.com/309689010/activiti-explorer-5.22.0)

