package com.example.controller;

import com.example.model.User;
import com.example.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private IUserService userService;

    @GetMapping(value = "/index")
    public String index(){
//        log.info("432432432423");
        List<User> list =userService.queryList("1");
        for (User user : list) {
           log.info("################[{}]++++++s",user.getName());
           log.info("################age[{}]",user.getAge());
        }
        return "www.baidu.com";
    }
    @GetMapping(value = "/index1")
    public String create() {
        User user = new User();
        user.setAge("12");
        user.setName("测试");
        user.setGender("1");
        user.setPassword("124322");
        int a = userService.insert(user);
        return String.valueOf(a);
    }
    @GetMapping(value = "/index2")
    public String update(){
        User user = new User();
        user.setName("这得");
        user.setId(1);
        int a = userService.updateNameById(user);
        return String.valueOf(a);
    }
    @GetMapping(value = "/index3")
    public String delete() {
        int a = userService.deleteById(2);
        return String.valueOf(a);
    }
}
