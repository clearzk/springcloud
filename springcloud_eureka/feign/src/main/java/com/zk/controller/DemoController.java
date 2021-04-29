package com.zk.controller;

import com.zk.api.service.DemoService;
import com.zk.api.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/consumer/getUser")
    public User consumerUser() {
        User user = this.demoService.getUser();
        return user;
    }
}
