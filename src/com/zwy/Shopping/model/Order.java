package com.zwy.Shopping.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Order实体类
 * 订单
 */
public class Order {

    /**
     * 订单编号
     */
    private int id;

    /**
     * 会员
     */
    private User user;

    /**
     * 订单创建时间
     */
    private Date date;

    /**
     * 总价
     */
    private BigDecimal total;

    /**
     * 订单状态
     */
    private short status;

    /**
     * 订单详情列表
     */
    private List<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}

