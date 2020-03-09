package com.stone.mvc.servlet;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//  ControllerAdvice表明这个是一个专门的异常处理类
@ControllerAdvice
public class MyExceptionContext
{
    //  ExceptionHandler注解用来处理异常信息
    @ExceptionHandler(value = {Exception.class})
    //  方法参数Exception会自动名将错误信息封装到Exception中
    public ModelAndView exception1(Exception ex){
        //  创建ModelAndView并设置跳转页面
        ModelAndView modelAndView= new ModelAndView("myexcepton");
        //  将错误信息存放在request域当中
        modelAndView.addObject("ex",ex);

        System.out.println("Exception错误类运行");
        return modelAndView;
    }
}
