package com.smoner.aop.example.advice.throwsadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengjqc on 16-12-9.
 */
public class SpringXMLTestThrowableAdvice {
    public static void main(String[] args) throws Exception {
        String configPath="com/smoner/aop/example/advice/throwsadvice/springthrow.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService service = (ForumService) ctx.getBean("servicetarget");
//            service.removeForum(10);
            service.updateForum(30);
    }
}
