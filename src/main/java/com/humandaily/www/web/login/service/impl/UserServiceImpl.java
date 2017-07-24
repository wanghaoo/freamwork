package com.humandaily.www.web.login.service.impl;

import com.humandaily.www.mapper.UserMapper;
import com.humandaily.www.web.login.Po.User;
import com.humandaily.www.web.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by datadriver on 2017/7/23.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }
}
