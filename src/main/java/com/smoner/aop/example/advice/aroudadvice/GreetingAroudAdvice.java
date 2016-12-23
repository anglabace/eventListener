package com.smoner.aop.example.advice.aroudadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by fengjqc on 16-12-10.
 */
public class GreetingAroudAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("How are you ! Mr."+clientName+".");
        Object obj = invocation.proceed();
        System.out.println("Please enjoy yourself !");
        return obj;
    }
}
