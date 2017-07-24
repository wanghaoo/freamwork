package com.humandaily.www.common.Security;

import com.humandaily.www.web.login.Po.User;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by datadriver on 2017/7/23.
 */
public class EndecryptUtils {
    public static User md5Password(String username, String password){
        SecureRandomNumberGenerator secureRandomNumberGenerator=new SecureRandomNumberGenerator();
        String salt= secureRandomNumberGenerator.nextBytes().toHex();
        //组合username,两次迭代，对密码进行加密
        String password_cipherText= new Md5Hash(password,username+salt,2).toBase64();
        User user=new User();
        user.setPassword(password_cipherText);
        user.setSalt(salt);
        user.setUsername(username);
        return user;
    }

    public static  boolean checkMd5Password(String username,String password,String salt,String md5cipherText)
    {
        //组合username,两次迭代，对密码进行加密
        String password_cipherText= new Md5Hash(password,username+salt,2).toHex();
        return md5cipherText.equals(password_cipherText);
    }
}
