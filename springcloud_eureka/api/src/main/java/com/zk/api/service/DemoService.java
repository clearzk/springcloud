package com.zk.api.service;

import com.zk.api.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
//@FeignClient(name = "PROVIDER",fallback = MyHystrix.class)//熔断
@FeignClient(name = "PROVIDER",fallbackFactory = MyHystrixFactory.class)//降级
public interface DemoService {

    @GetMapping(value = "/provider/getUser")
    User getUser();

}
