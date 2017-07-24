package com.humandaily.www.web.login.service;

import com.humandaily.www.web.login.Po.User;
import org.springframework.stereotype.Service;

/**
 * Created by datadriver on 2017/7/23.
 */
@Service
public interface UserService {
    User getUserByUserName(String userName);
}
