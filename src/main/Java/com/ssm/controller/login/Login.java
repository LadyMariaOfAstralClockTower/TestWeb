package com.ssm.controller.login;

import com.ssm.model.User;
import com.ssm.service.UserInfoManager;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by GodWei on 2018/7/30
 * Good Good Study! Day Day Up!
 */
@Controller
@RequestMapping("/login")
public class Login{

    Logger log=Logger.getLogger(Login.class);

    @Autowired
    private UserInfoManager userInfo;

    @RequestMapping(value="/login")
    public String goToLogin(){
        return "/login/Login.html";
    }

    @RequestMapping(value="/register")
    public String goToRegister(){
        return "login/Register.html";
    }

    @RequestMapping(value = "/checkLogin")
    public String checkLogin(@RequestParam(value = "loginid") String loginid,
                             @RequestParam(value = "password") String password,
                             HttpServletRequest request){

        Map map=new HashMap();
        map.put("loginid",loginid);
        map.put("password", password);
        User user=userInfo.checkLogin(map);
        if(user!=null){
            log.error(user.name+"登录成功！");
            log.error(JSONObject.fromObject(user));
            HttpSession session=request.getSession();
            session.setAttribute("userinfo",user);
            return "redirect:/main/main";
        }else{
            log.error(loginid+"登录失败！");
            request.setAttribute("msg","用户名或密码错误！");
            return "redirect:/login/Login.html";
        }



    }

    @RequestMapping(value = "/checkLoginid")
    @ResponseBody
    public String checkLoginid(@RequestParam(value = "loginid") String loginid){

        User user=userInfo.checkLoginid(loginid);
        if(user!=null){
            return "1";
        }else{
            return "0";
        }

    }


    @RequestMapping(value="/gotoRegister")
    @ResponseBody
    public String register(@RequestParam(value = "loginid") String loginid,
                           @RequestParam(value = "password") String password){

        Map map=new HashMap();
        map.put("loginid",loginid);
        map.put("password", password);
        userInfo.register(map);

        return "0";
    }

}
