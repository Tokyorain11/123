package com.all.boot6mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.all.boot6mybatis.dao")
public class Boot6MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot6MybatisApplication.class, args);
    }

}
