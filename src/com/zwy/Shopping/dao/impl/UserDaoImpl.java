package com.zwy.Shopping.dao.impl;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.zwy.Shopping.connection.DBCon;
import com.zwy.Shopping.dao.UserDao;
import com.zwy.Shopping.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    /**
     * 多方式登录
     * 名字密码登录
     * 手机号登录
     * 邮箱登录
     *
     * @param name
     * @param password
     * @return User
     */
    @Override
    public User login(String name, String password) {
        //获取数据库链接
        Connection conn = DBCon.getConnection();
        //如果链接为空,则数据库连接失败
        if (conn == null) {
            System.out.println("数据库连接失败");
            return null;
        }
        try {
            //在数据库中查找,这里是多条件查询,
            PreparedStatement pst = conn.prepareStatement("select * from user where (name = ? or mobile = ? or email = ? )and password = ? ");
            pst.setString(1, name);
            pst.setString(2, name);
            pst.setString(3, name);
            pst.setString(4, password);

            //获得查询结果
            ResultSet rs = pst.executeQuery();
            //创建一个user对象用来保存查找到的对象
            User user = null;
            if (rs.next()) {
                //将查找到的数据,传入对象
                user = new User();
                user.setName(rs.getString("name"));
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(password);
                user.setMobile(rs.getString("mobile"));
                user.setAddress(rs.getString("address"));
            }
            //释放链接资源

            rs.close();
            pst.close();
            //链接暂时不关闭
           // conn.close();
            return user;



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean isUserExisted(String key, String value) {
        //获取链接
        Connection con = DBCon.getConnection();
        if(con == null){
            System.out.println("数据库链接失败");
            return false;
        }
        //构建执行语句获得返回集
        try {
            PreparedStatement pst = con.prepareStatement("select * from user where  ? = ?");
            pst.setString(1,value);
            pst.setString(2,value);
            //返回集
            ResultSet rs = pst.executeQuery();
            //是否查找到
            boolean result = rs.next();
            //关闭连接资源
            rs.close();
            pst.close();
            //con.close();
            //返回值
            return result;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 注册使用的用户添加方法
     * @param user
     */

    @Override
    public void addUser(User user) {

    }

    @Override
    public void changeUserInfo(User user) {

    }
}
