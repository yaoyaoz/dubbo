项目结构：
主要分三大模块：
dubbo-api:存放公共接口

dubbo-provider:提供远程服务
    F:\workspaces\github\dubbo\DubboDemo\dubbo-provider\src\main\resources\provider.xml
    启动远程服务:com.alibaba.dubbo.demo.impl.Provider

dubbo-consumer:调用远程服务
    F:\workspaces\github\dubbo\DubboDemo\dubbo-consumer1\src\main\resources\consumer.xml
    启动Consumer,调用远程服务:com.alibaba.dubbo.consumer.Consumer

至此，就模拟了dubbo服务的注册和消费
