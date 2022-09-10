package com.all.boot7incepetor.config;

import com.all.boot7incepetor.filter.myFilter;
import com.all.boot7incepetor.incepetor.incepetor;
import com.all.boot7incepetor.servlet.myServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new incepetor()).addPathPatterns("/*");

    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean=new FilterRegistrationBean();
        bean.setFilter(new myFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean();
        bean.setServlet(new myServlet());
        bean.addUrlMappings("/servlet");
        return bean;
    }


}
