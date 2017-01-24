package com.gjr.xmlann;

import javax.annotation.Resource;

/**
 * Created by geng
 * on 2017/1/25.
 */
public class BookService {

    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "orderDao")
    private OrderDao orderDao;

    public void showBookService() {
        System.out.println("show book service ...");

        bookDao.showBookDao();
        orderDao.showOrderDao();
    }
}
