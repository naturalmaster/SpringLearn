package cn.buscat.spring.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {


    @RequestMapping("say")
    public String hello() {
        return "hello world";
    }
}
