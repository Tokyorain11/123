package com.all.boot3incepetor.config;

import com.all.boot3incepetor.incepetor.myIncepetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class SpringMVCconfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String []add={"/user/*"};
        String []except={"/user/login"};
        myIncepetor m1=new myIncepetor();

        registry.addInterceptor(m1).addPathPatterns(add).excludePathPatterns(except);

    }
}
