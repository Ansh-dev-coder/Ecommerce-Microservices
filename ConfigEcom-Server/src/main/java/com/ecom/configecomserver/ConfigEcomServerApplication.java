package com.ecom.configecomserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigEcomServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEcomServerApplication.class, args);
    }

}
