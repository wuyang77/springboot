package com.atguigu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer // 开启Admin服务管理
public class SpringBootAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApplication.class,args);
    }
}
