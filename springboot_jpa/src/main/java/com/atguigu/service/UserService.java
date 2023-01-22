package com.atguigu.service;

import com.atguigu.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void delete(Long id );
}
