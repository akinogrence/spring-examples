package com.akinogrence.api;

import java.util.HashMap;
import java.util.List;

import com.akinogrence.entity.User;
import com.akinogrence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init()
    {
        User user =new User();
        user.setName("Akin");
        user.setSurname("Ogrence");
        user.setProperties(new HashMap());
        userRepository.save(user);

    }


    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> showAll() {

        return ResponseEntity.ok(userRepository.findAll());
    }
}