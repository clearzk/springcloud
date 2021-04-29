package zk.controller;

import com.zk.api.pojo.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/provider",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Log4j2
public class ProController {

    @GetMapping(value = "/getUser")
    public User getUser() {
        User user=new User("zk",18,"芜湖");
        log.info("访问的是 provider:7002 节点");
        return user;
    }


}
