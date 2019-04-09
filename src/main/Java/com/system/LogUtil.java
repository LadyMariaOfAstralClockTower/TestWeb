package com.system;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by GodWei on 2018/11/24
 * Good Good Study! Day Day Up!
 */
public class LogUtil {

    public static void log(Object obj){

        Logger log=Logger.getLogger(LogUtil.class);
        System.out.println(obj);
        log.error(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date())+" "+obj);

    }

}
