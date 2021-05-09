package com.helpjun.business.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "")
    public ModelAndView list(){
        return new ModelAndView("/test/test");
    }
}
