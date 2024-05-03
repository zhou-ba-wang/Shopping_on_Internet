package com.zwy.Shopping.dao;

import com.zwy.Shopping.model.User;

public interface UserDao {
    //登录功能
    User login(String name, String password);
    //注册功能,添加User信息
   void addUser(User user);
    //修改个人信息功能
   void changeUserInfo(User user);
   //判断name,mobile,email是否重复
    boolean isUserExisted(String key,String value);

}
