package com.system;

/**
 * Create by GodWei on 2018/9/11
 * Good Good Study! Day Day Up!
 */
public class EncodeUtil {

    /**
     * MD5加密
     * @param str
     * @return
     */
    public static String encodeByMD5(String str){

        String encoder="";

        try {
            MD5 md5=new MD5();
            encoder=md5.md5(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return encoder;

    }



    public static boolean checkStr(String str1,String str2){
        boolean flag=false;
        try {
            MD5 md5=new MD5();
            flag=md5.verify(str1,str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

}
