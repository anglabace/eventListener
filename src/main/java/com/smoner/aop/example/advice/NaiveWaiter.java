package com.smoner.aop.example.advice;

/**
 * Created by fengjqc on 16-12-9.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to"+name+"...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to "+name+"...");
    }
}
