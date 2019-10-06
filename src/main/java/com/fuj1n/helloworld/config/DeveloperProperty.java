package com.fuj1n.helloworld.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author huangFuJin
 * @date 2019/10/6 13:10
 * mail: naaturalmaster@gmail.com
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {

    private String name;

    private String webSite;

    private String qq;

    private String phoneNumber;

}
