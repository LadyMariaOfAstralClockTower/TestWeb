package com.ssm.controller.main;

import com.ssm.service.UserInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by GodWei on 2018/7/26
 * Good Good Study! Day Day Up!
 */
@Controller
@RequestMapping("/main")
public class Main {

    @Autowired
    UserInfoManager um;

    @RequestMapping(value="/main")
    public String gotoMain(){
        return "/main/main.jsp";
    }

}
