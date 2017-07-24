package com.humandaily.www.common.freamwork;

import com.humandaily.www.common.Security.EndecryptUtils;
import com.humandaily.www.web.login.Po.User;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * Created by datadriver on 2017/7/23.
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken authcToken, AuthenticationInfo info) {
        User user = (User) authcToken;
        User endecryptUser = EndecryptUtils.md5Password(user.getUsername(), user.getPassword());
        String password = (String) getCredentials(info);
        //将密码加密与系统加密后的密码校验，内容一致就返回true,不一致就返回false
        return equals(endecryptUser.getPassword(), password);
    }
}
