package com.gjr.ann;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by geng
 * on 2017/1/25.
 */
@Service(value = "userService")
public class UserService {

    // 1. 第一种
//    @Autowired
//    private UserDao userDao;// 要使用UserDao的对象，使用自动装配

    // 2. 第二种
    @Resource(name = "userDao") // name 值必须和 UserDao 内的value值必须一样，否则报错：no such bean is defined
    private UserDao userDao;// 这种是明确指定创建哪种类型的对象，比较常用

    public void showUserService() {
        System.out.println("show user service ...");
        userDao.showUserDao();
    }
}
