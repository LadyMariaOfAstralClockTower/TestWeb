package com.conn;

import com.system.LogUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by GodWei on 2018/11/24
 * Good Good Study! Day Day Up!
 */
public class RecordSet extends LogUtil {

    private String driver="com.mysql.jdbc.Driver";

    private String url="jdbc:mysql://localhost/test";

    private Connection conn;

    private Statement sta;

    private ResultSetMetaData rsmd;

    private ResultSet resultSet;

    private List<Object> resultList=new ArrayList<>();

    private Map<String,String> dataMap=new HashMap<>();

    private int resultCount;

    private int index=0;

    public boolean execute(String sql){
        boolean flag=true;

        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,"root","123456");
            sta=conn.createStatement();
            if(sql.startsWith("select")){
                resultSet=sta.executeQuery(sql);
                rsmd=resultSet.getMetaData();
                parseToList();
            }else{
                flag=!sta.execute(sql);
            }

        }catch (Exception e){
            flag=false;
            e.printStackTrace();
            log(e.getMessage());
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                flag=false;
                e.printStackTrace();
                log(e.toString());
            }
        }

        return flag;
    }

    public boolean next(){
        boolean flag=false;
        try {
            if(resultCount>0){
                if(index<resultCount){
                    dataMap=(Map<String, String>) resultList.get(index);
                    index++;
                    flag=true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            log(e.toString());
        }
        return flag;
    }

    public String getString(String str){
        String rst="";
        try {
            rst=dataMap.get(str);
        }catch (Exception e){
            rst="";
            e.printStackTrace();
            log(e.toString());
        }
        return rst==null?"":rst;
    }

    public int getResultCount(){
        return resultCount;
    }

    private void parseToList(){
        try {
            resultCount=0;
            while(resultSet.next()){
                Map<String,String> map=new HashMap<String,String>();
                for(int i=1;i<=rsmd.getColumnCount();i++){
                    String key=rsmd.getColumnName(i);
                    String value=resultSet.getString(rsmd.getColumnName(i));
                    map.put(key,value==null?"":value);
                }
                resultList.add(map);
                resultCount++;
            }
            index=0;
        }catch (SQLException e){
            e.printStackTrace();
            log(e.toString());
        }
    }

}
