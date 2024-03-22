package com.process.shop.controller;

import com.process.shop.model.User;
import com.process.shop.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserServices userServices;
    @PostMapping
    public User createUser(@RequestBody User user){   //recibe peticiones
        return userServices.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) { // Cambiado @RequestParam a @PathVariable
        return userServices.getUserById(id);
    }
}
