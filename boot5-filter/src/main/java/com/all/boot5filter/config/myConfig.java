package com.all.boot5filter.config;

import com.all.boot5filter.servlet.myServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

@Configuration
public class myConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean bean=new ServletRegistrationBean();
        bean.setServlet(new myServlet());
        bean.addUrlMappings("/servlet");
        return bean;
    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        CharacterEncodingFilter c1=new CharacterEncodingFilter();
        c1.setEncoding("UTF-8");
        c1.setForceEncoding(true);

        bean.setFilter(c1);
        bean.addUrlPatterns("/*");

        return bean;
    }
}
