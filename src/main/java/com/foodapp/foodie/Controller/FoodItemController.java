package com.foodapp.foodie.Controller;

import com.foodapp.foodie.Repository.FoodItemRepository;
import com.foodapp.foodie.Service.OrderService;
import com.foodapp.foodie.model.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {
    @Autowired
    FoodItemRepository foodItemRepository;

    @Autowired
    OrderService orderService;

    @GetMapping("/getfood")
    public Iterable<FoodItem> fetchFood()
    {
        return foodItemRepository.findAll();
    }

    //fetch restaurants based on location
    @GetMapping("/getfood/{item_name}")
    public Iterable<FoodItem> restaurantList(@PathVariable("item_name") String item_Name)
    {
        return foodItemRepository.finditemByName(item_Name);
    }

}
