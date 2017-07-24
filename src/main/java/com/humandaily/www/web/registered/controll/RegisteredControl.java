package com.humandaily.www.web.registered.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by datadriver on 2017/7/22.
 */
@Controller
@RequestMapping(value = "/registered")
public class RegisteredControl {
    @RequestMapping(method = RequestMethod.GET)
    public String registered() {
        return "registered/registered";
    }

    @RequestMapping(value = "doRegistered", method = RequestMethod.POST)
    public String doRegistered(@ModelAttribute RegisteredControl user) {

        return "welcome";
    }
}
