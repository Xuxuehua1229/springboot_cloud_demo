package com.test.user_server_provider.service.impl;

import com.test.springbootutils.bean.User;
import com.test.user_server_provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserInfoById(Long id) {
        System.out.println("进入getUserInfoById方法");
        User user = new com.test.springbootutils.bean.User();
        user.setId(id);
        user.setAge(36);
        user.setName("abc");
        user.setUsername("zhangsan");
        return user;
    }

}
