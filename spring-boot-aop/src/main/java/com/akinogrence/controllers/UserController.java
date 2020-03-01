package com.akinogrence.controllers;


import com.akinogrence.entity.Message;
import com.akinogrence.entity.User;
import com.akinogrence.repository.UserRepository;
import com.akinogrence.services.MessageService;
import com.akinogrence.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/userOperations")
public class UserController {

    @Autowired
   private UserService userService;


    @PostMapping
    @RequestMapping("/saveUser")
    private ResponseEntity<User> saveUser(@RequestBody User user) {

        return ResponseEntity.ok(userService.saveUser(user));
    }


    @PostMapping
    @RequestMapping("/deleteUser/{id}")
    private ResponseEntity<User> deleteUser(@PathVariable String id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }

    @GetMapping
    @RequestMapping("/getUsers")
        private ResponseEntity<List<User>> findAllUsers()
    {
        return  ResponseEntity.ok(userService.findAllUsers());
    }

}
