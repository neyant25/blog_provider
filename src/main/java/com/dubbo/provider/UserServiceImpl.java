package com.dubbo.provider;


import com.dubbo.api.UserService;

/**
 * 
 * @author K_D_Lee
 *
 */
public class UserServiceImpl implements UserService {
    public String sayHi(String s) {
        return "hello " + s + "!";
    }
}
