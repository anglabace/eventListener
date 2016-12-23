package com.smoner.aop.example.advice.beforeadvice;

import com.smoner.aop.example.advice.NaiveWaiter;
import com.smoner.aop.example.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengjqc on 16-12-9.
 */
public class SpringXMLTestBeforeAdvice {
    public static void main(String[] args){
        String configPath="com/smoner/aop/example/advice/beforeadvice/spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        NaiveWaiter w = (NaiveWaiter) ctx.getBean("target");
        Waiter proxy = (Waiter) ctx.getBean("waiter");
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
