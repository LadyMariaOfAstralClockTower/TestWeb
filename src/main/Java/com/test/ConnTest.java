package com.test;

import java.sql.*;

/**
 * Create by GodWei on 2018/7/19
 */
public class ConnTest {

    public static String driver="com.mysql.jdbc.Driver";

    public static String url="jdbc:mysql://localhost/test";

    private static Connection conn;

    private static Statement sta;

    public static void main(String[] args) {

        try {

            Class.forName(driver);
            conn=DriverManager.getConnection(url,"root","123456");
            sta=conn.createStatement();
            String sql="select * from hrmResource";
            ResultSet rs=sta.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }



}
