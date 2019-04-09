package com.ssm.service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Create by GodWei on 2018/7/26
 * Good Good Study! Day Day Up!
 */
@Service
public class UserInfoManager {

    @Autowired
    UserMapper user;

    /**
     * 获取所有人员的信息
     * @return
     */
    public List<User> getUserInfo(){
        return user.getUserInfo();
    }

    /**
     * 通过参数获取指定人员的信息
     * @param param
     * @return
     */
    public User getUserInfoById(Map param){
        return user.getUserInfoById(param);
    }


    /**
     * 校验登录
     * @param map
     * @return
     */
    public User checkLogin(Map map){
        return user.checkLogin(map);
    }

    /**
     * 校验用户名
     * @param loginid
     * @return
     */
    public User checkLoginid(String loginid){
        return user.checkLoginid(loginid);
    }

    /**
     * 注册
     * @param map
     */
    public int register(Map map){
         return user.register(map);
    }

}
