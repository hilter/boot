package com.lee.demo.dao;

import com.lee.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    User findByUserName(String userName);

}
