package com.mustapha.fullstuckapp.controller;

import com.mustapha.fullstuckapp.model.User;
import com.mustapha.fullstuckapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
