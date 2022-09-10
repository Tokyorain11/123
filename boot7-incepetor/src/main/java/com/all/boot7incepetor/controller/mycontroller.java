package com.all.boot7incepetor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {

    @ResponseBody
    @RequestMapping("/c1")
    public String c1(){
        return "你好springboot中的拦截器";
    }

    @ResponseBody
    @RequestMapping("/user/test")
    public String c2(Integer i){
        return String.valueOf(i);
    }

}
