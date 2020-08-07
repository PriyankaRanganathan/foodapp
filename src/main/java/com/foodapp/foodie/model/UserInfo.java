package com.foodapp.foodie.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
public class UserInfo{


    @Id
    private int userId;
    private String userName;
    private long phoneNo;
    private String deliveryAddress;
    private long deliveryPincode;
    @OneToMany(mappedBy = "orderinfo")
    private List<Orders> orderlist;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public long getDeliveryPincode() {
        return deliveryPincode;
    }

    public void setDeliveryPincode(long deliveryPincode) {
        this.deliveryPincode = deliveryPincode;
    }

    public List<Orders> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<Orders> orderlist) {
        this.orderlist = orderlist;
    }

    public UserInfo() {
    }

    public UserInfo(int userId, String userName, long phoneNo, String deliveryAddress, long deliveryPincode) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPincode = deliveryPincode;
    }

}
