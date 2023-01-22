package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.dao")//扫描Mapper接口
@EnableTransactionManagement //开启事务注解的支持
public class SpringBootCaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCaseApplication.class,args);

    }
}
