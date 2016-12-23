package com.smoner.aop.example.advice.throwsadvice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * Created by fengjqc on 16-12-10.
 */
public class TransactionManager implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, SQLException ex) throws Throwable{
        System.out.println("----------");
        System.out.println("Method:"+method.getName());
        System.out.println("抛出异常："+ex.getMessage());
        System.out.println("成功回滚事务。");
    }
  public   void afterThrowing( RuntimeException ex) throws Throwable{
        System.out.println("----------");
        System.out.println("Method:");
        System.out.println("抛出异常：");
        System.out.println("成功回滚事务。");
    }
}
