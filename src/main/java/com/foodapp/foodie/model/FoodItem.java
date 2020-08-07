package com.foodapp.foodie.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
public class FoodItem {

    @Id
    private int ItemId;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @ManyToOne
 private Restaurant restaurant;
    private String ItemName;
    private String ItemRate;

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemRate() {
        return ItemRate;
    }

    public void setItemRate(String itemRate) {
        ItemRate = itemRate;
    }

//    public List<Restaurant> getRestaurant() {
//        return restaurant;
//    }
//
//    public void setRestaurant(List<Restaurant> restaurant) {
//        this.restaurant = restaurant;
//    }

    public FoodItem() {
    }

    public FoodItem(int itemId, String itemName, String itemRate) {
        ItemId = itemId;
        ItemName = itemName;
        ItemRate = itemRate;
    }
}
