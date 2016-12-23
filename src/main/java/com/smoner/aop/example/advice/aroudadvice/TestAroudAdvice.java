package com.smoner.aop.example.advice.aroudadvice;

import com.smoner.aop.example.advice.NaiveWaiter;
import com.smoner.aop.example.advice.Waiter;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by fengjqc on 16-12-10.
 */
public class TestAroudAdvice {
    public static void main(String[] args){
        NaiveWaiter target = new NaiveWaiter();
        MethodInterceptor aroudadvice = new GreetingAroudAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(aroudadvice);
        Waiter proxy =(Waiter)pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
