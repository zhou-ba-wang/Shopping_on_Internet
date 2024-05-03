package com.zwy.Shopping.Test;

import com.zwy.Shopping.dao.UserDao;
import com.zwy.Shopping.dao.impl.UserDaoImpl;
import com.zwy.Shopping.model.User;

public class test01 {
    public static void main(String[] args) {
        //测试user登录功能
        UserDao userDao = new UserDaoImpl();
        User user = userDao.login("user","123456");
        System.out.println(user);
        //测试user对象查重功能
        System.out.println(userDao.isUserExisted("name","user"));

    }
}
