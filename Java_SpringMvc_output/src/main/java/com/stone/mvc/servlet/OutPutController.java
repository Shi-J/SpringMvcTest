package com.stone.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@SessionAttributes(value = {"map","model"})
public class OutPutController
{

    //   将数据传输到前台页面 第一种方式 原生api
    @RequestMapping("/output1")
    public String outPut1(@RequestParam("value") String value, HttpSession session, HttpServletRequest request){
        //  设置session域中的值
        session.setAttribute("value",value);
        //  request域当中
        request.setAttribute("value",value);
        return  "success1";
    }

    //   将数据传输到前台页面 第二种方式 map
    @RequestMapping("/output2")
    public String outPut2(@RequestParam("valueMap") String valueMap, Map<String ,Object> map){
            map.put("map",valueMap);
        return  "success2";
    }

    //   将数据传输到前台页面 第三种方式 model
    @RequestMapping("/output3")
    public String outPut3(@RequestParam("valueModel") String valueModel,Model model){
        model.addAttribute("model",valueModel);
        return  "success3";
    }

    //   将数据传输到前台页面 第四种方式 modelMap
    @RequestMapping("/output4")
    public String outPut4(@RequestParam("valueModelMap") String valueModelMap, ModelMap modelMap){
        modelMap.addAttribute("valueModelMap",valueModelMap);
        return  "success4";
    }

    //   将数据传输到前台页面 第五种方式 modelandview
    @RequestMapping("/output5")
    public ModelAndView outPut5(@RequestParam("modelandview") String modelandview){
        //  modelAndView构造器
        ModelAndView modelAndView = new ModelAndView("success5");
        modelAndView.addObject("modelandview",modelandview);

        return  modelAndView;
    }


    //   将数据传输到前台页面 第五种方式 modelandview
    @RequestMapping("/output6")
    public ModelAndView outPut6(@RequestParam("modelandview2") String modelandview2,ModelAndView modelAndView){
        Map<String, Object> model = modelAndView.getModel();
        model.put("modelandview2",modelandview2);

        modelAndView.setViewName("success6");
        return  modelAndView;
    }

}
