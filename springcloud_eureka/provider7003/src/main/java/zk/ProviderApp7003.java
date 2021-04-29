package zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApp7003
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderApp7003.class,args);
    }
}
