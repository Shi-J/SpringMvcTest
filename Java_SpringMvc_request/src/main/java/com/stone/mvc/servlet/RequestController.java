package com.stone.mvc.servlet;

import com.stone.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.management.Agent;

@Controller
public class RequestController
{
    @RequestMapping("request1")
    public String request1(
            @RequestParam(name="name",required = false,defaultValue = "无值") String name
            ){
        System.out.println("name的值为 :" + name);
        return "success";
    }

    @RequestMapping("request2")
    public String request2(@RequestHeader(value = "User-Agent",required = false,defaultValue = "无请求头信息") String userAgent){
        System.out.println("请求头User-Agent的信息 :" + userAgent);
        return "success";
    }


    @RequestMapping("request3")
    public String request3(@CookieValue(value = "JSESSIONID",required = false,defaultValue = "无JSESSIONID")  String jid ){
        System.out.println("JSESSIONID的值 :" + jid);
        return "success";
    }


    @RequestMapping("request4")
    public String request4(User user){
        System.out.println("user = " + user);

        return "success";
    }

}
