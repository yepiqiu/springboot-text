package com.yepi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yepi.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTextApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTextApplication.class, args);
    }


    @RequestMapping("/json")
    @ResponseBody
    String test() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("邱", 12, "男");
        String s = mapper.writeValueAsString(user);
        return s;

    }
}
