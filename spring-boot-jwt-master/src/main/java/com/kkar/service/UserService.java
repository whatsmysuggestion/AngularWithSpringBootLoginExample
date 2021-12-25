package com.kkar.service;

import java.util.List;

import com.kkar.model.User;
import com.kkar.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
