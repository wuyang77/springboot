package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import com.atguigu.properties.DataSourceProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(DataSourceProperties2.class)
@RestController
public class HelloSpringBoot {
    @Autowired
    private DataSourceProperties dataSourceProperties;
    @Autowired
    private DataSourceProperties2 dataSourceProperties2;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("dataSourceProperties = " + dataSourceProperties);
        System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
        return "Hello SpringBoot Self";
    }
}
