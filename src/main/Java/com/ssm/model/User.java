package com.ssm.model;

import javax.persistence.Entity;

/**
 * Create by GodWei on 2018/7/26
 * Good Good Study! Day Day Up!
 */
@Entity
public class User {

    public int id;
    public String loginid;
    public String password;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
