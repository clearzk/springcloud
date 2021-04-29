package com.zk.api.service;

import com.zk.api.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MyHystrixFactory implements FallbackFactory<DemoService> {

    @Override
    public DemoService create(Throwable throwable) {
        return new DemoService() {
            @Override
            public User getUser() {
                return new User("服务降级",0,"unknown");
            }
        };
    }
}
