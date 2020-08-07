package com.foodapp.foodie.Repository;

import com.foodapp.foodie.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {

    @Query(value="SELECT r.restaurant_Name FROM restaurant r WHERE r.location= :location",nativeQuery = true)
    public Iterable<String> findRestaurantByLoc(@Param("location") String location);
}
