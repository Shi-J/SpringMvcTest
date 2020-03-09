package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlController
{

    /*错误演示*/
    @RequestMapping("/handle0")
    public String handle0(){
        System.out.println("handle0运行");
        /*
        错误演示
            视图解析器：
            <bean id="internalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
               <property name="prefix" value="/WEB-INF/pages/"></property>
                <property name="suffix" value=".jsp"/>
            </bean>

        如果经过了视图解析器按到理会找到/WEB-INF/pages/hello.jsp页面
        * */
        return "forward:/hello";
    }


    @RequestMapping("/handle1")
    public String handle1(){
        System.out.println("handle1运行");
        //  转发
        return "forward:/hello.jsp";
    }


    @RequestMapping("/handle2")
    public String handle2(){
        System.out.println("handle2运行");
        //  重定向
        return "redirect:/hello.jsp";
    }
}
