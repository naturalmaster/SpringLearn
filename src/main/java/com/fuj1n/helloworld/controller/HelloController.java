package com.fuj1n.helloworld.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangFuJin
 * @date 2019/10/6 12:25
 * mail: naaturalmaster@gmail.com
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(@RequestParam(required = false, name = "name")String name){
        if (StringUtils.isEmpty(name)) {
            name = "world";
        }
        return "hello " + name;
    }
}
