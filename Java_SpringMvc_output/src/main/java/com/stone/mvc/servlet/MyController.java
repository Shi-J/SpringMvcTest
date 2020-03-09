package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController
{
    @RequestMapping(value = "/exhandle1")
    public String handle1(@RequestParam("i") Integer i){
        System.out.println(10/i);
        return "success";
    }
}
