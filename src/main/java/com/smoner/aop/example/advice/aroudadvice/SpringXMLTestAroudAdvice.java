package com.smoner.aop.example.advice.aroudadvice;

import com.smoner.aop.example.advice.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengjqc on 16-12-9.
 */
public class SpringXMLTestAroudAdvice {
    public static void main(String[] args){
        String configPath="com/smoner/aop/example/advice/aroudadvice/spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter proxy = (Waiter) ctx.getBean("waiter");
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
