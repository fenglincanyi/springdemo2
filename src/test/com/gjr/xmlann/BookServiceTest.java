package com.gjr.xmlann;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by geng
 * on 2017/1/25.
 */
public class BookServiceTest {

    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("beans1.xml");
    }

    @Test
    public void showBookService() throws Exception {
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.showBookService();
    }

}