package com.zk.controller;

import com.zk.api.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/provider",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ProController {


    @GetMapping(value = "/getUser")
    public User getUser() {
        User user=new User("zk",18,"芜湖");
        return user;
    }


}
