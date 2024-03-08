package com.process.shop.services;

import com.process.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServices {
    User createUser(User user);

    User updateUser(User user, Long id);

    User getUserById(Long id);

    List<User> findAllUsers();
}
