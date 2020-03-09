package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{


    @RequestMapping(value = "/exhandle1")
    public String handle1(@RequestParam("i") Integer i){
        System.out.println(10/i);
        return "success";
    }

    @RequestMapping(value = "/rshandle2")
    public String handle2(String username,String password){
        //  判断用户是不是admin
        if(!username.equals("admin")){
            System.out.println("登录失败,找不到该用户");
            //  自定义异常错误信息
            throw new UserInexistenceException();
        }else{
            System.out.println("登录成功");
        }
        return "success";
    }


    //  通过配置的显示来处理异常信息
    @RequestMapping(value = "/serhandle3")
    public String handle3(){
        System.out.println("调用handle3方法...");
        String str = null;
        System.out.println(str.length());
        return "success";
    }


}
