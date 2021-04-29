## 作为服务注册中心eureka比zookeeper好在哪里

著名的CAP理论指出，一个分布式系统不可能同时满足C(一致性)、A(可用性)、P(容错性)
由于分区容错性P在分布式系统中是必须要保证的，因此我们只能在A、C之间权衡

*zookeeper 保证的是CP*

*eureka 保证的是AP*

zookeeper、eureka各自适合的应用场景？

