package com.gjr.ann;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/25.
 */
public class UserServiceTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void showUserService() throws Exception {
        UserService userService = (UserService) context.getBean("userService");
        userService.showUserService();
    }

}