package com.humandaily.www.web.registered.service.impl;

import com.humandaily.www.common.Security.EndecryptUtils;
import com.humandaily.www.mapper.RegisteredMapper;
import com.humandaily.www.web.login.Po.User;
import com.humandaily.www.web.registered.Po.Registered;
import com.humandaily.www.web.registered.service.RegisteredService;
import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by datadriver on 2017/7/23.
 */
public class RegisteredServiceImpl implements RegisteredService {
    @Autowired
    RegisteredMapper registeredMapper;
    @Autowired
    PasswordService passwordService;

    @Override
    public void doRegiestered(Registered registered) {
        User user = EndecryptUtils.md5Password(registered.getUsername(), registered.getPassword());
        registered.setPassword(user.getPassword());
        registered.setSalt(user.getSalt());
        registeredMapper.doRegistered(registered);
    }
}
