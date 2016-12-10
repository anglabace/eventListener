package com.smoner.aop.example.advice.beforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by fengjqc on 16-12-9.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.print("How are you ! Mr."+clientName+".");
    }
}
