package com.atguigu.dao;

import com.atguigu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
