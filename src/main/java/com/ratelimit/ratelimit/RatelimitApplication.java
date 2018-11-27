package com.ratelimit.ratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RatelimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatelimitApplication.class, args);
    }

}
