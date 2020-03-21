package com.yangfeng.controller;

import com.yangfeng.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //http://localhost:8080/json
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public User json(){
        User user = new User("老王","天上人间",80);
        return user;
    }

    //http://localhost:8080/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public User xml(){
        User user = new User("老王","天上人间",80);
        return user;
    }
}
