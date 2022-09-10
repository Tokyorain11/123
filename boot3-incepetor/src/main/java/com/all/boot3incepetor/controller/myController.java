package com.all.boot3incepetor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class myController {

    @RequestMapping("/user/c1")
    @ResponseBody
    public String c1(HttpServletRequest request){
        return "这里是"+request.getServletPath();
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String c2(HttpServletRequest request){
        return "这里是"+request.getServletPath();
    }

}
