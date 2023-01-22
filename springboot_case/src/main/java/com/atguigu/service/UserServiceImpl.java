package com.atguigu.service;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public List<User> findAll() {
        //去Redis缓存中查询所有的数据
        List<User> userList = (List<User>) redisTemplate.boundValueOps("userList").get();
        if(userList == null){
            //证明是第一次查询，Redis缓存中还没有数据，此时需要查询数据库
            List<User> users = userMapper.selectAll();
            //将查询到的数据放到Redis中
            redisTemplate.boundValueOps("userList").set(users);
            System.out.println("查询数据库");
        }
        System.out.println("查询缓存");
        return userList;
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
