package com.example.boot2.all.service;

import org.springframework.stereotype.Service;

@Service("help1")
public class help1 {
    public void sout(String name){
        System.out.println("输出以下这个名字"+name);
    }
}
