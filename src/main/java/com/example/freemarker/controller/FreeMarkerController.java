package com.example.freemarker.controller;

import com.example.freemarker.defineMethod.SortMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping(path = "/free")
public class FreeMarkerController {
    static {
        System.out.println("初始化了free");
    }
    @RequestMapping(value = "/get/index",method = RequestMethod.GET)
    public ModelAndView getIndex(){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("sort_int",new SortMethod());
        return modelAndView;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getIndexPage(Map<String,Object> model){
        return "index";
    }
}
