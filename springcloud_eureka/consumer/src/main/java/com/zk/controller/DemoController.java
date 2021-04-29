package com.zk.controller;

import com.zk.api.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX="http://PROVIDER";

    @GetMapping(value = "/consumer/getUser")
    public User consumerUser() {
        User user = restTemplate.getForObject(REST_URL_PREFIX + "/provider/getUser", User.class);
        return user;
    }

}
