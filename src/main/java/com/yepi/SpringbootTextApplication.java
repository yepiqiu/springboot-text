package com.yepi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTextApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTextApplication.class, args);
    }


    @RequestMapping("/get")
    String test() {
        return "hello,world";
    }
}
