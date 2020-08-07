package com.foodapp.foodie.Repository;

import com.foodapp.foodie.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {
}
