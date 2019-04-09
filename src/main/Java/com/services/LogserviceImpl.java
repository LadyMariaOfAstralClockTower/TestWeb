package com.services;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Create by GodWei on 2019/1/31
 * Good Good Study! Day Day Up!
 */
@WebService(endpointInterface = "com.services.LogserviceImpl")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@RequestMapping("/services/LogserviceImpl")
public class LogserviceImpl implements Logservice {

    @Override
    @WebMethod
    public void print(String str){
        System.out.println(str);
    }

}
