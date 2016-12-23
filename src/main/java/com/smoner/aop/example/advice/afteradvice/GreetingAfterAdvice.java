package com.smoner.aop.example.advice.afteradvice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by fengjqc on 16-12-10.
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Please enjoy yourself !");
    }
}
