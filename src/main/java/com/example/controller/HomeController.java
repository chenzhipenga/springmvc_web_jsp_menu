package com.example.controller;

import beilei.report.entity.ReportBaseInfo;
import beilei.report.service.ReportBaseInfoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private ReportBaseInfoService reportBaseInfoService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        //return jsp的文件名就可以跳转到对应的jsp
        model.addAttribute("test","AAAAAAA");
        return "hello";
    }
    @RequestMapping("/getById")
    public ModelAndView getById() {
        ReportBaseInfo info = reportBaseInfoService.getById(1L);
        System.out.println("info:" + JSONObject.toJSONString(info));
        //return jsp的文件名就可以跳转到对应的jsp
        List<ReportBaseInfo> list = new ArrayList<>();
        list.add(info);
        list.add(ReportBaseInfo.builder().id(2L).build());
        list.add(ReportBaseInfo.builder().id(3L).build());
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("info", info);
        modelAndView.addObject("list", list);
        modelAndView.addObject("test", "FFFFF");
        return modelAndView;
    }

    @RequestMapping("/getById2")
    public ModelAndView getById2() {
        ReportBaseInfo info = reportBaseInfoService.getById(1L);
        System.out.println("info:" + JSONObject.toJSONString(info));
        ModelAndView modelAndView = new ModelAndView("info2");
        modelAndView.addObject("info", info);
        return modelAndView;
    }


    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("report/index");
        return modelAndView;
    }

    @RequestMapping("/userList")
    public ModelAndView userList() {
        ReportBaseInfo info = reportBaseInfoService.getById(1L);
        System.out.println("info:" + JSONObject.toJSONString(info));
        //return jsp的文件名就可以跳转到对应的jsp
        List<ReportBaseInfo> list = new ArrayList<>();
        list.add(info);
        list.add(ReportBaseInfo.builder().id(2L).build());
        list.add(ReportBaseInfo.builder().id(3L).build());
        ModelAndView modelAndView = new ModelAndView("report/userList");
        modelAndView.addObject("info", info);
        modelAndView.addObject("list", list);
        modelAndView.addObject("test", "FFFFF");
        return modelAndView;
    }

    @RequestMapping("/productList")
    public ModelAndView productList() {
        ModelAndView modelAndView = new ModelAndView("report/productList");
        return modelAndView;
    }

    @RequestMapping("/recordList")
    public ModelAndView recordList() {
        ModelAndView modelAndView = new ModelAndView("report/recordList");
        return modelAndView;
    }
}
