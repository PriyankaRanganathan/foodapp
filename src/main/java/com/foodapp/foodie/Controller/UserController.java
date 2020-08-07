package com.foodapp.foodie.Controller;

import com.foodapp.foodie.Repository.UserRepository;
import com.foodapp.foodie.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.metadata.ItemMetadata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userinfo")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //fetch all the users
    @GetMapping("/findusers")
    public Iterable<UserInfo> fetchUser()
    {
        return userRepository.findAll();
    }

    //Fetch users based on userId
    @GetMapping("/findusersbyId/{id}")
    public Optional<UserInfo> fetchUserById(@PathVariable("id") int userId)

    {
        return userRepository.findById(userId);
    }


}
