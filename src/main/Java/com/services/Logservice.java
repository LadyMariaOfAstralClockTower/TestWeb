package com.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Create by GodWei on 2019/1/31
 * Good Good Study! Day Day Up!
 */
@WebService
public interface Logservice {

    @WebMethod
    public void print(String str);

}
