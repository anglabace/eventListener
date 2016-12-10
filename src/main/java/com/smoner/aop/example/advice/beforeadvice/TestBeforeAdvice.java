package com.smoner.aop.example.advice.beforeadvice;

import com.smoner.aop.example.advice.NaiveWaiter;
import com.smoner.aop.example.advice.Waiter;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by fengjqc on 16-12-9.
 */
public class TestBeforeAdvice  {
    public static void main(String[] args){
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(advice);
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
