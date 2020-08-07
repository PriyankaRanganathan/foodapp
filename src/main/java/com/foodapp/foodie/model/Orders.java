package com.foodapp.foodie.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Orders {

    @Id
    private int orderId;
    private String orderNumber;
    private String orderStatus;
    private String orderQuantity;
    private String orderTotal;
    @ManyToOne
    private Restaurant restaurantorder;
    @ManyToOne
    private UserInfo orderinfo;


    public UserInfo getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(UserInfo orderinfo) {
        this.orderinfo = orderinfo;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Restaurant getRestaurantorder() {
        return restaurantorder;
    }

    public void setRestaurantorder(Restaurant restaurantorder) {
        this.restaurantorder = restaurantorder;
    }


    public Orders(int orderId, String orderNumber, String orderStatus) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public Orders() {
    }

}
