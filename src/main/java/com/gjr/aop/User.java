package com.gjr.aop;

/**
 * Created by geng
 * on 2017/1/25.
 *
 * 用于说明 aop 相关概念
 */
public class User {

    public void add(){
    }

    public void update(){
    }

    public void delete(){
    }

    public void findAll(){
    }
}

    /**
     * 连接点 JoinPoint：类中哪些方法可以被 增强，这些方法就是 连接点
     * 切入点 PointCut：类中实际增强类那些方法（如：add,update)，这些方法称为 切入点
     * 通知／增强 advice: 增强的逻辑，如：要扩展日志功能，则日志功能为 增强／通知
     *      分为：前置通知(方法之前执行），后置通知，异常通知(方法出现异常)，最终通知(后置之后执行)，环绕通知(方法之前和之后执行)
     * 切面 aspect：把增强功能应用到具体方法上，这个过程叫切面。即：把增强应用到切入点的过程
     * 目标对象 target: 要增强的类，代理的目标对象
     * 织入 weaving: 把增强应用到目标的过程，把advice 应用到target的过程
     * 代理 Proxy: 一个类被aop织入增强后，就产生一个结果代理类
     */
