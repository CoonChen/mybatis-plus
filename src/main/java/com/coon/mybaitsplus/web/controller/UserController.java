package com.coon.mybaitsplus.web.controller;

import com.coon.mybaitsplus.domain.User;
import com.coon.mybaitsplus.dto.UserDto;
import com.coon.mybaitsplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "save")
    void save(User user) {
        userRepository.insert(user);
    }

    @RequestMapping(value = "delete")
    Integer delete(String id) {
        return userRepository.deleteById(id);
    }

    @RequestMapping(value = "update")
    Integer update(User user) {
        return userRepository.updateById(user);
    }

    @RequestMapping(value = "selectById")
    User selectById(String id) {
        return userRepository.selectById(id);
    }

    @RequestMapping(value = "findOne")
    UserDto findOne(String id) {
        return userRepository.findOne(id);
    }
}
