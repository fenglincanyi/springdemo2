package com.gjr.annaop;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/25.
 */
public class OrderTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans3.xml");
    }

    @Test
    public void show() throws Exception {
        Order order = (Order) context.getBean("order");
        order.show();
    }

}