package com.common;

/**
 * Create by GodWei on 2018/7/26
 * Good Good Study! Day Day Up!
 */
public class Util {

    public static int getInValue(String str){
        return getIntValue(str,0);
    }

    public static int getIntValue(String str,int def){

        try {
            return Integer.parseInt(str);
        } catch (Exception ex) {
            return def;
        }

    }

}
