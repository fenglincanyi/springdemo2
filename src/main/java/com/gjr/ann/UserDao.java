package com.gjr.ann;

import org.springframework.stereotype.Component;

/**
 * Created by geng
 * on 2017/1/25.
 */

@Component(value = "userDao")
public class UserDao {

    public void showUserDao() {
        System.out.println("show user dao ...");
    }
}
