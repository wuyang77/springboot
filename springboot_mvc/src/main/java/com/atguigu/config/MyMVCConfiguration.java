package com.atguigu.config;

import com.atguigu.interceptor.MySpringMVCInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration //声明当前类是一个配置类
public class MyMVCConfiguration implements WebMvcConfigurer {

    //注入我们创建的拦截器
    @Autowired
    private MySpringMVCInterceptor mySpringMVCInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mySpringMVCInterceptor)
                .addPathPatterns("/user/findAll")//配置拦截的请求
                .excludePathPatterns("/index.html");// 配置不拦截的请求

    }
}
