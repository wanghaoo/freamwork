package com.humandaily.www.web.registered.Po;

import com.humandaily.www.web.login.Po.User;

/**
 * Created by datadriver on 2017/7/23.
 */
public class Registered extends User {
    private String comfirmPassword;

    public String getComfirmPassword() {
        return comfirmPassword;
    }

    public void setComfirmPassword(String comfirmPassword) {
        this.comfirmPassword = comfirmPassword;
    }
}
