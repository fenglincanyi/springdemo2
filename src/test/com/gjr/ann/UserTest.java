package com.gjr.ann;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/24.
 */
public class UserTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
         context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void show() throws Exception {
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        System.out.println(user);
        user.show();
        System.out.println(user == user1);
    }

}