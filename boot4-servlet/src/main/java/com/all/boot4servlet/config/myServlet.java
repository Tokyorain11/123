package com.all.boot4servlet.config;

import com.all.boot4servlet.servlet.servlet1;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class myServlet {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>(new servlet1(),"/servlet");


        return bean;


    }

}
