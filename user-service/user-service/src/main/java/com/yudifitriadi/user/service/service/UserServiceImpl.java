/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudifitriadi.user.service.service;

import com.yudifitriadi.user.service.dto.User;
import com.yudifitriadi.user.service.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author user
 */
@Service
public abstract class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    
    
    @Override
    public List<User> getAlluser() {
        return userRepository.getAllUser();
    }

    @Override
    public User getUser(String id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
       userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(String id) {
        return userRepository.deleteUser(id);
    }
    
}
