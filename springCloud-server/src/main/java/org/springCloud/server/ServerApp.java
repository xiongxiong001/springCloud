package org.springCloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApp 
{
    public static void main( String[] args )
    {
		SpringApplication.run(ServerApp.class, args);

        System.out.println( "Hello World!" );
    }
}
