package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMapperAndTest
{
    //  精准匹配
    @RequestMapping(value = "/and1")
    public String requestMapperAnd1(){
        System.out.println("requestMapperAnd1方法被调用");
        return "success1";
    }

    //  ?匹配一个字符
    @RequestMapping(value = "/and?")
    public String requestMapperAnd2(){
        System.out.println("requestMapperAnd2方法被调用");
        return "success1";
    }

    //  *匹配任意多个字符
    @RequestMapping(value = "/and*")
    public String requestMapperAnd3(){
        System.out.println("requestMapperAnd3方法被调用");
        return "success1";
    }


    //  *匹配任意一层路径
    @RequestMapping(value = "/*/and*")
    public String requestMapperAnd4(){
        System.out.println("requestMapperAnd4方法被调用");
        return "success1";
    }


    //  **匹配多层路径
    @RequestMapping(value = "/**/and*")
    public String requestMapperAnd5(){
        System.out.println("requestMapperAnd45法被调用");
        return "success1";
    }



}
