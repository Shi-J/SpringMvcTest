package com.stone.mvc.servlet;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BookController
{
    /*
        添加图书 (post请求)
        使用method设置拦截的提交方式
    */
    @RequestMapping(value="/book",method = RequestMethod.POST)
    public String addBook(@RequestParam("bid") Integer bid, HttpSession session){
        System.out.println("添加了"+bid+"号图书");
        session.setAttribute("bid",bid);
        return "addBook";
    }

    /*
        删除图书 (delete请求)
    */
    @RequestMapping(value="/book",method = RequestMethod.DELETE)
    public String deleteBook(@RequestParam("bid") Integer bid, HttpSession session){
        System.out.println("删除了"+bid+"号图书");
        session.setAttribute("bid",bid);
        return "deleteBook";
    }

    /*
        修改图书 (put请求)
    */
    @RequestMapping(value="/book",method = RequestMethod.PUT)
    public String updateBook(@RequestParam("bid") Integer bid, HttpSession session){
        System.out.println("修改了"+bid+"号图书");
        session.setAttribute("bid",bid);
        return "updateBook";
    }

    /*
        查询图书 (get请求)
    */
    @RequestMapping(value="/book",method = RequestMethod.GET)
    public String selectBook(@RequestParam("bid") Integer bid, HttpSession session){
        System.out.println("查询了"+bid+"号图书");
        session.setAttribute("bid",bid);
        return "selectBook";
    }
}
