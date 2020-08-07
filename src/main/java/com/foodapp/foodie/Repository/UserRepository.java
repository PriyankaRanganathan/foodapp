package com.foodapp.foodie.Repository;

import com.foodapp.foodie.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo,Integer> {
}
