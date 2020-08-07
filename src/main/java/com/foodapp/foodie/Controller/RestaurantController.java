package com.foodapp.foodie.Controller;

import com.foodapp.foodie.Repository.RestaurantRepository;
import com.foodapp.foodie.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantapi")
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    //fetch all restaurants
    @GetMapping("/getall")
public Iterable<Restaurant> fetchallRestaurants()
{
    return restaurantRepository.findAll();
}

//fetch restaurants based on location
@GetMapping("/getrestaurants/{location}")
    public Iterable<String> restaurantList(@PathVariable("location") String location)
    {
       return restaurantRepository.findRestaurantByLoc(location);
    }
}
