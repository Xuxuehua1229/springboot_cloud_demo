package com.test.user_server_provider.controller;

import com.test.springbootutils.bean.User;
import com.test.user_server_provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET)
    public User findById1(@PathVariable("id") Long id){
        return userService.getUserInfoById(id);
    }
}
