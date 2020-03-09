package com.stone.mvc.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class Myi18n
{

    //  自动注入ResourceBundleMessageSource类型的值
    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "i18Test")
    public String i18Test(Locale locale){
        System.out.println("区域信息:"+locale);
        //  getMessage(key,占位符数组,区域信息)
        String welcomelog = messageSource.getMessage("welcomelog", null, locale);
        System.out.println(welcomelog);
        System.out.println("i18Test方法运行");
        return "i18n";
    }
}
