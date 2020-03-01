package com.akinogrence.services;

import com.akinogrence.entity.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public User deleteUser(String id);

    public List<User> findAllUsers();
}
