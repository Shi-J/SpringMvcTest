package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //  表示这个类是控制器类
public class MyController
{
    @RequestMapping("/springmvc1") //    请求映射
    public String helloMvc01(){
        System.out.println("helloMvc01 收到请求");
        return "success";  //    return当前请求映射跳转的路径
    }




}
