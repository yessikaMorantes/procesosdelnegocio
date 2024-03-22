package com.process.shop.services;

import com.process.shop.model.User;
import com.process.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImplement implements UserServices{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User userUpdated, Long id) {
        Optional<User> userBD = userRepository.findById(id);
        if(userBD.isEmpty()){
            return null;
        }
        userBD.get().setFullName(userUpdated.getFullName());
        userBD.get().setPhone(userUpdated.getPhone());
        return userRepository.save(userBD.get());
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            return null;
        }
        return user.get();
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
