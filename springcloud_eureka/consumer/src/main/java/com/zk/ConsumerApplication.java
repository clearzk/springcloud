package com.zk;

import com.zk.config.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER",configuration = MyRule.class)
public class ConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
