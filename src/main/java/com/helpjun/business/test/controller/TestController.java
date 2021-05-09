package com.helpjun.business.test.controller;

import com.helpjun.business.test.entity.SysUserEntity;
import com.helpjun.business.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "")
    public ModelAndView list(){
        List<SysUserEntity> allUser = sysUserService.findAllUser();
        return new ModelAndView("/test/test");
    }
}
