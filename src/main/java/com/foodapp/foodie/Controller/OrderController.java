package com.foodapp.foodie.Controller;

import com.foodapp.foodie.Repository.OrderRepository;
import com.foodapp.foodie.Service.OrderService;
import com.foodapp.foodie.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/placeorder")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveorder")
    public Orders createOrders(@RequestBody Orders orders)
    {
        return orderService.createOrder(orders);
    }
    @PutMapping("/saveorder/updateorder")
    public Orders updateOrdering(@RequestParam("id") int id,@RequestBody Orders orders) throws Exception
    {
       return orderService.updateOrder(id,orders);
    }

    @GetMapping("/getorders")
    public Iterable<Orders> getOrders()
    {
       return  orderService.getAllOrders();
    }
}
