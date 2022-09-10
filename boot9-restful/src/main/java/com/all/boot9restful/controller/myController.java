package com.all.boot9restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @GetMapping("/user/{name}")
    @ResponseBody
    public String rest(@PathVariable("name")String name){
        return name;
    }

}
