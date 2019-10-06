package com.fuj1n.helloworld.controller;

import com.fuj1n.helloworld.config.ApplicationProperty;
import com.fuj1n.helloworld.config.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.lang.Dict;
/**
 * @author huangFuJin
 * @date 2019/10/6 13:18
 * mail: naaturalmaster@gmail.com
 */
@RestController
public class PropertyController {

    private final ApplicationProperty applicationProperty;

    private final DeveloperProperty developerProperty;


    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
    }

    @GetMapping("/property")
    public Dict index(){
        return Dict.create().set("applicationProperty", applicationProperty)
                .set("developerProperty", developerProperty);
    }
}
