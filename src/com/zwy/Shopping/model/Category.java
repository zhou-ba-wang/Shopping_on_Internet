package com.zwy.Shopping.model;

/**
 * Category实体类
 * 两个成员变量
 */
public class Category {
    /**
     * 类别编号,自增长
     */
    private int id;
    /**
     * 类别名称
     */
    private String name;

    public int getId() {
        return id;
    }

    /**
     * getter,setter方法
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
