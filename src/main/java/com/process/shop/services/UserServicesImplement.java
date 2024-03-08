package com.process.shop.services;

import com.process.shop.model.User;

import java.util.List;

public class UserServicesImplement implements UserServices{
    @Override
    public User createUser(User user) {
        return new User();
    }

    @Override
    public User updateUser(User user, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
