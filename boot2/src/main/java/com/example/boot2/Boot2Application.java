package com.example.boot2;

import com.example.boot2.all.service.help1;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Boot2Application implements ApplicationRunner {

    @Resource
    private help1 h1;

    public static void main(String[] args) {
        System.out.println("准备启动springboot的run方法");
        SpringApplication.run(Boot2Application.class, args);
        System.out.println("springboot中的run方法已经执行完毕");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        h1.sout("张三");
    }
}
