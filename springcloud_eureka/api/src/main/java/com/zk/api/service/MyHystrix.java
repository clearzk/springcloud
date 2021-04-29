package com.zk.api.service;

import com.zk.api.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class MyHystrix implements DemoService{
    @Override
    public User getUser() {
        return new User("error",-1,"myHystrix");
    }
}
