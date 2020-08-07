package com.foodapp.foodie.Repository;

import com.foodapp.foodie.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodItemRepository extends CrudRepository<FoodItem,Integer> {

    @Query(value="SELECT * FROM Food_Item r WHERE r.item_Name= :item_Name",nativeQuery = true)
    public Iterable<FoodItem> finditemByName(@Param("item_Name") String item_Name);
}
