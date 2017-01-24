package com.gjr.ann;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by geng
 * on 2017/1/24.
 */
@Component(value = "user") // ==> <bean id="user"/>
//@Service(value = "user") // 4种 创建对象的注解功能是一样的，只是为了后期扩展
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 默认是 singleton
public class User {

    public void show() {
        System.out.println("show user ...");
    }
}
