package com.humandaily.www.mapper;

import com.humandaily.www.web.login.Po.User;

import java.util.List;

/**
 * Created by datadriver on 2017/7/19.
 */
public interface UserMapper {
    List<User> getUserList();
    User getUserByUserName(String userName);
}
