package com.foodapp.foodie.Service;

import com.foodapp.foodie.model.FoodItem;
import com.foodapp.foodie.model.Orders;

public interface OrderService {

    public Orders createOrder(Orders orders);

    public Orders updateOrder(int id,Orders orders) throws Exception;

    public Iterable<Orders> getAllOrders();


}