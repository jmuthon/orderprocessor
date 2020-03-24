package com.orderprocessor.controller;


import com.orderprocessor.model.User;
import com.orderprocessor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("deliver-it/create-user")
    public void createUser(@RequestBody User user){
        System.out.println("Winner: "+user.getFirstName());
        System.out.println(user.toString());
        userRepository.save(user);
    }
    @GetMapping("deliver-it/retrieve-user/id/{id}")
    public User retrieveUser(@PathVariable("id") int id){
      Optional<User> userRetrieved= userRepository.findById(id);
       return userRetrieved.get();
    }

    @GetMapping("deliver-it/retrieve-users")
    public List<User> retrieveUser(){
        List<User> userRetrieved= (List<User>) userRepository.findAll();
        return userRetrieved;
    }
}
