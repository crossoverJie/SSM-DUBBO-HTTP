![](https://travis-ci.org/crossoverJie/SSM-DUBBO-HTTP.svg?branch=master)

# 开发

http://crossoverjie.top/2017/05/02/SSM13/

# 预览
![dubbo-http封面.jpg](https://ooo.0o0.ooo/2017/04/30/5905dae5d9b8c.jpg)

# 简介
将 dubbo 服务对外暴露出`http`服务。

可供其他任何语言进行调用。


# 安装

```
git clone https://github.com/crossoverJie/SSM-DUBBO-HTTP.git

cd SSM-DUBBO-HTTP

mvn clean

mvn install
```


# 使用

```xml
<dependency>
    <groupId>com.crossoverJie</groupId>
    <artifactId>SSM-HTTP-PROVIDER</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Spring 配置

```xml
    <!--dubbo服务暴露为http服务-->
    <bean class="com.crossoverJie.dubbo.http.conf.HttpProviderConf">
        <property name="usePackage">
            <list>
            	   <!--需要暴露服务的接口包名，可多个-->
                <value>com.crossoverJie.api</value>
            </list>
        </property>
    </bean>
    <!--扫描暴露包-->
    <context:component-scan base-package="com.crossoverJie.dubbo.http"/>
```


## 联系作者

> crossoverJie#gmail.com

![](https://ws1.sinaimg.cn/large/006tKfTcly1frz6eaf3s4j308c0au0ss.jpg)