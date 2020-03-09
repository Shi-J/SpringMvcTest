package com.stone.mvc.servlet;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

@Controller
@RequestMapping("/r1")
public class RequestMapperTestController
{
    @RequestMapping(path="/handle1")
    public String requestMapper1(){

        return "success";
    }

    @RequestMapping(value = "/handle2",method = RequestMethod.POST)
    public String requestMapper2(){

        return "success";
    }

    //  params设置指定的参数值
    @RequestMapping(value = "/handle3",params = {"username=zs"})
    public String requestMapper3(){

        return "success";
    }

    /*
    headers设置请求头信息
         User-Agent
         火狐游览器信息：Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0
         谷歌游览器信息：Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36
    * */
    @RequestMapping(value = "/handle4")
    public String requestMapper4(){

        return "success";
    }
}
