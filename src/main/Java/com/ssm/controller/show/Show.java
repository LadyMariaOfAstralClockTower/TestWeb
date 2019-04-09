package com.ssm.controller.show;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by GodWei on 2018/7/30
 * Good Good Study! Day Day Up!
 */
@Controller
@RequestMapping("/show")
public class Show {

    @RequestMapping(value="/showSth")
    public String getStr(@RequestParam(value = "id") String id,
                         @RequestParam(value = "loginid") String loginid,
                         @RequestParam(value = "password") String password,
                         @RequestParam(value = "name") String name,
                         @RequestParam(value = "hobby") String[] hobby){
        System.out.println("id:"+id+" loginid:"+loginid+" password:"+password+" name:"+name);
        for(String str:hobby){
            System.out.println("hobby:"+str);
        }
        return "/main/main.jsp";
    }

}
