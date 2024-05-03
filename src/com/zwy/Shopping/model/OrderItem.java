package com.zwy.Shopping.model;

import java.math.BigDecimal;

public class OrderItem {
    /**
     * 详情编号
     */
    private int id;

    /**
     * 订单编号
     */
    private int orderId;

    /**
     * 商品
     */
    private Product product;

    /**
     * 商品价格(冗余，商品调价后此处不变)
     */
    private BigDecimal price;

    /**
     * 商品数量
     */
    private int quantity;

    /**
     * 计算小记
     */
    public BigDecimal getTotal() {
        return this.price.multiply(BigDecimal.valueOf(quantity));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

