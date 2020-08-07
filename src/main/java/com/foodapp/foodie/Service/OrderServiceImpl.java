package com.foodapp.foodie.Service;

import com.foodapp.foodie.Repository.FoodItemRepository;
import com.foodapp.foodie.Repository.OrderRepository;
import com.foodapp.foodie.model.FoodItem;
import com.foodapp.foodie.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    FoodItemRepository foodItemRepository;

    @Override
    public Orders createOrder(Orders orders) {
        return orderRepository.save(orders);
    }


    @Override
    public Orders updateOrder(int id,Orders orders) throws Exception {
        Optional<Orders> orderdb=this.orderRepository.findById(orders.getOrderId());
        if(orderdb.isPresent())
        {
            Orders orders11=orderdb.get();
            orders11.setOrderStatus("Ordered");
            orderRepository.save(orders11);
            return orders11;
        }
        else
        {
            throw new Exception("Record not found");
        }
    }

    @Override
    public Iterable<Orders> getAllOrders() {
        return this.orderRepository.findAll();
    }

}
