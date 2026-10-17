package com.ecom.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.out.println("TZ DEBUG: " + TimeZone.getDefault().getID());
        SpringApplication.run(OrderApplication.class, args);
    }

}
