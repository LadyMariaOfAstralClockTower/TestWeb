package com.ssm.dao;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Create by GodWei on 2018/7/26
 * Good Good Study! Day Day Up!
 */
@Repository
public interface UserMapper {

    /**
     * 通过参数获取指定人员的信息
     * @param map
     * @return
     */
    User getUserInfoById(Map map);


    /**
     * 获取所有人员的信息
     * @return
     */
    List<User> getUserInfo();

    /**
     * 校验登录
     * @return
     */
    User checkLogin(Map map);

    /**
     * 校验登录名
     * @param loginid
     * @return
     */
    User checkLoginid(String loginid);

    /**
     * 注册
     * @param map
     * @return
     */
    int register(Map map);

}
