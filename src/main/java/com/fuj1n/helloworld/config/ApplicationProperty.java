package com.fuj1n.helloworld.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author huangFuJin
 * @date 2019/10/6 12:43
 * mail: naaturalmaster@gmail.com
 */
@Data
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperty {

//    @Value("${application.name}")
    private String name;

//    @Value("${application.version}")
    private String versison;
}
