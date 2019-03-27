package com.itheima.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControl {

    @RequestMapping("hello")
    public ModelAndView hello(){
        System.out.println("hello world.");
        ModelAndView mav = new ModelAndView();

        mav.addObject("msg","hello spring..................");
        mav.setViewName("WEB-INF/jsp/hello.jsp");

        return mav;
    }
}
