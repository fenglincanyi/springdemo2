package com.gjr.annaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by geng
 * on 2017/1/25.
 */

@Aspect
public class MyOrder {

    @Before(value = "execution(* Order.show(..))")
    public void addFunction() {
        System.out.println("add function ...");
    }

    @After(value = "execution(* Order.*(..))")
    public void addFunctionAfter() {
        System.out.println("after add function ...");
    }

    @Around(value = "execution(* Order.*(..))")
    public void aroundFunction() {
        System.out.println("arround ...");
    }
}
