# 预览

```properties
2017-04-25 15:15:38,968 DEBUG [com.alibaba.dubbo.remoting.transport.DecodeHandler] -  [DUBBO] Decode decodeable message com.alibaba.dubbo.rpc.protocol.dubbo.DecodeableRpcInvocation, dubbo version: 2.5.3, current host: 127.0.0.1
2017-04-25 15:15:39,484 DEBUG [com.crossoverJie.dubbo.filter.DubboTraceFilter] - dubbo请求数据:{"args":[1],"interfaceName":"com.crossoverJie.api.UserInfoApi","methodName":"getUserInfo"}
2017-04-25 15:15:39,484 INFO [com.crossoverJie.api.impl.UserInfoApiImpl] - 用户查询Id=1
2017-04-25 15:15:39,505 DEBUG [org.mybatis.spring.SqlSessionUtils] - Creating a new SqlSession
2017-04-25 15:15:39,525 DEBUG [org.mybatis.spring.SqlSessionUtils] - SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6f56b29] was not registered for synchronization because synchronization is not active
2017-04-25 15:15:39,549 DEBUG [org.mybatis.spring.transaction.SpringManagedTransaction] - JDBC Connection [com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl@778b3121] will not be managed by Spring
2017-04-25 15:15:39,555 DEBUG [com.crossoverJie.api.dubbo.dao.T_userDao.selectByPrimaryKey] - ==>  Preparing: select id, username, password,roleId from t_user where id = ? 
2017-04-25 15:15:39,591 DEBUG [com.crossoverJie.api.dubbo.dao.T_userDao.selectByPrimaryKey] - ==> Parameters: 1(Integer)
2017-04-25 15:15:39,616 DEBUG [com.crossoverJie.api.dubbo.dao.T_userDao.selectByPrimaryKey] - <==      Total: 1
2017-04-25 15:15:39,616 DEBUG [com.alibaba.druid.pool.PreparedStatementPool] - {conn-10003, pstmt-20000} enter cache
2017-04-25 15:15:39,617 DEBUG [org.mybatis.spring.SqlSessionUtils] - Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@6f56b29]
2017-04-25 15:15:45,473 INFO [com.crossoverJie.dubbo.filter.DubboTraceFilter] - dubbo执行成功
2017-04-25 15:15:45,476 DEBUG [com.crossoverJie.dubbo.filter.DubboTraceFilter] - dubbo返回数据{"args":[{"id":1,"password":"123456","roleId":1,"userName":"crossoverJie"}],"interfaceName":"com.crossoverJie.api.UserInfoApi","methodName":"getUserInfo"}
```

# 简介
dubbo日志扩展插件，方便定位并排查异常。

# 安装

```
cd /SSM-DUBBO-FILTER
```

```
mvn clean
```

```
mvn install
```

# 使用

```xml
<dependency>
    <groupId>com.crossoverJie</groupId>
    <artifactId>SSM-TRACE-FILTER</artifactId>
    <version>1.0.0</version>
</dependency>
```
