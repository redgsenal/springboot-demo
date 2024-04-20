package com.springboot.sample.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hellothere")
    public String hello() {
        return "Hello There!!";
    }
}
