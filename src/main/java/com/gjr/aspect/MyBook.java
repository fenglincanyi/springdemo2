package com.gjr.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by geng
 * on 2017/1/25.
 */
public class MyBook {

    public void addFunctionBefore() {
        System.out.println("在前面，加点功能 。。。");
    }

    public void addFunctionAfter() {
        System.out.println("在后面，加点功能 。。。");
    }

    public void arroundFunction(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("之前环绕 。。。");
        proceedingJoinPoint.proceed();
        System.out.println("之后环绕 。。。");
    }
}
