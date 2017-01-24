package com.gjr.ann;

import org.springframework.stereotype.Component;

/**
 * Created by geng
 * on 2017/1/24.
 */
@Component(value = "user")
public class User {

    public void show() {
        System.out.println("show user ...");
    }
}
