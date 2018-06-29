package com.lee.demo.service;

import com.lee.demo.dao.UserDao;
import com.lee.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByName(String username) {
        return userDao.findByUserName(username);
    }

}
