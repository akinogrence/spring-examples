package com.akinogrence.services;

import com.akinogrence.entity.User;
import com.akinogrence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(String id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.delete(user.get());


        return user.get();


    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
