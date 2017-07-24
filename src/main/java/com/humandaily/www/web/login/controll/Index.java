package com.humandaily.www.web.login.controll;

import com.humandaily.www.mapper.UserMapper;
import com.humandaily.www.web.login.Po.Message;
import com.humandaily.www.web.login.Po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by datadriver on 2017/7/13.
 */
//@RestController
@Controller
@RequestMapping("/")
public class Index {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test/{param}")
    public Message indexToo(@PathVariable String param) {
        Message message = new Message(param);
        return message;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login () {
        return "index";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin (@ModelAttribute User user, Model model) {
        System.out.print("---------------"+user.getUsername());
        List<User> userList = userMapper.getUserList();
        for (User tempUser : userList) {
            System.out.println(tempUser.getUsername());
        }
        model.addAttribute(user);
        Subject userSub = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            userSub.login(token);
        }catch (AuthenticationException e) {
            token.clear();
            System.out.print(e.getStackTrace());
            return "index";
        }
        return "welcome";
    }
}
