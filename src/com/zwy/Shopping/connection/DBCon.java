package com.zwy.Shopping.connection;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
//Mysql8.0以上 - JDBC 驱动名以及数据库 URL
    //JDBC驱动名
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //数据库URL,ecommerce的位置是数据库的名称
    static final String  DB_URL = "jdbc:mysql://localhost:3306/ecommerce?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    //数据库的用户名以及密码
    static final String USER = "root";
    static final String PASS = "123456";
    //写出一个Connection变量
   private static Connection connection = null;
   public static Connection getConnection(){
        if(connection == null) {
            // 注册 JDBC 驱动
            try {
                Class.forName(JDBC_DRIVER);
                // 打开链接
                System.out.println("连接数据库...");
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                //
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return connection;
    }

}
