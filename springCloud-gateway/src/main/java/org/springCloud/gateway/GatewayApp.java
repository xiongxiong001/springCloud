package org.springCloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello GatewayApp!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApp 
{
    public static void main( String[] args )
    {
		SpringApplication.run(GatewayApp.class, args);
        System.out.println( "Hello GatewayApp!" );
    }
}
