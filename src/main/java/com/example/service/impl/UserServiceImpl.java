package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryList(String name){
        return userMapper.queryList(name);
    }

    public int insert(User user){
        return userMapper.insert(user);
    }

    public int updateNameById(User user){
        return userMapper.updateNameById(user);
    }

    public int deleteById(Integer id){
        return userMapper.deleteById(id);
    }
}
