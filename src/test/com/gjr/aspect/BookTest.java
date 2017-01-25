package com.gjr.aspect;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/25.
 *
 * 测试 xml 实现 aop
 */
public class BookTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans2.xml");
    }

    @Test
    public void show() throws Exception {
        Book book = (Book) context.getBean("book");
        book.show();
    }

}