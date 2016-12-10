package com.smoner.aop.example.advice;

/**
 * Created by fengjqc on 16-12-9.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.print("greet to"+name+"...");
    }

    @Override
    public void serveTo(String name) {
        System.out.print("serve to "+name+"...");
    }
}
