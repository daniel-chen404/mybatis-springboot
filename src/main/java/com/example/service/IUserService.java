package com.example.service;

import com.example.model.User;

import java.util.List;

public interface IUserService {

    public List<User> queryList(String name);

    public int insert(User user);

    int updateNameById(User user);

    int deleteById(Integer id);

}
