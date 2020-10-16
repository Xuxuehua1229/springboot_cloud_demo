package com.test.user_server_provider.service;


import com.test.springbootutils.bean.User;

public interface UserService {

    User getUserInfoById(Long id);
}
