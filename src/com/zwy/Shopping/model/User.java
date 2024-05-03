package com.zwy.Shopping.model;

/**
 * User实体类
 * 对应数据库user表
 * 意味着需要对数据库增删改查操作
 * 6个成员属性
 */
public class User {
    /**
     * 会员编号,自增长
     */
    private int id;
    /**
     * 会员姓名
     */
    private String name;
    /**
     * 邮件（作账户用）,唯一
     */
    private String email;
    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码,可以为空
     */
    private String mobile;

    /**
     * 邮寄地址,可以为空
     */
    private String address;
//封装,getter,setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//重写toString方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
