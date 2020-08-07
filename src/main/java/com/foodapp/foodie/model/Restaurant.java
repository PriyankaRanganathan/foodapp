package com.foodapp.foodie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Restaurant {

    @Id
    private int restaurantId;
    private String restaurantName;
    private String restaurantRating;
    private String location;

   // @ManyToMany(mappedBy = "restaurant")
  // @JoinColumn(name = "restaurant_Id", nullable = false)
   @OneToMany(mappedBy = "restaurant")
    private List<FoodItem> foodItemList;

    @OneToMany(mappedBy = "restaurantorder")
    private List<Orders> order;

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Orders> getOrder() {
        return order;
    }

    public void setOrder(List<Orders> order) {
        this.order = order;
    }

    public Restaurant(int restaurantId, String restaurantName, String restaurantRating, String location, List<Orders> order) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.location = location;
        this.order = order;
    }

    public Restaurant() {
    }
}
