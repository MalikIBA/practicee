package com.test.practice.controller;

import com.test.practice.dto.ResponseDTO;
import com.test.practice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private HelloService service;

    @Autowired
    public HelloController(HelloService service){
        this.service = service;
    }

    @GetMapping
    public ResponseDTO sayHi() {
        return service.response();
    }

    @GetMapping
    public ResponseDTO sayBye() {
        System.out.printf("Doo");
        return service.response();
    }

}
