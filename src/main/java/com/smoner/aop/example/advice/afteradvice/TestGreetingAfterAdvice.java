package com.smoner.aop.example.advice.afteradvice;

import com.smoner.aop.example.advice.NaiveWaiter;
import com.smoner.aop.example.advice.Waiter;
import com.smoner.aop.example.advice.beforeadvice.GreetingBeforeAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by fengjqc on 16-12-10.
 */
public class TestGreetingAfterAdvice {
    public  static void main(String[] args){
        NaiveWaiter target = new NaiveWaiter();
        AfterReturningAdvice afterReturningAdvice = new GreetingAfterAdvice();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(beforeAdvice);
        pf.addAdvice(afterReturningAdvice);
        pf.setTarget(target);
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
