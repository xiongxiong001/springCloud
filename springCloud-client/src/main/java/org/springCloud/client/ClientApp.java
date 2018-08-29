package org.springCloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ClientApp.class, args);
    	System.out.println( "Hello World!" );
    }
    @Value("${server.port}")
    private String port;
    
    @GetMapping("/service")
    public String service(@RequestParam String name){
    	return "service:" +name+",port is "+port;
    }
}
