package com.smoner.aop.example.advice.introduceadvice;

import com.smoner.aop.proxy.nativeExample.ForumService;
import com.smoner.aop.proxy.nativeExample.ForumServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengjqc on 16-12-9.
 */
public class SpringXMLTestIntroduceAdvice {
    public static void main(String[] args) throws Exception {
        String configPath="com/smoner/aop/example/advice/introduceadvice/springintroduce.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumServiceIntroduceImpl service = (ForumServiceIntroduceImpl) ctx.getBean("servicetarget");
        service.removeForum(10);
        service.removeTopic(20);
        Monitorable monitorable = (Monitorable)service;
        monitorable.setMonitorActive(true);
        service.removeTopic(100);
        service.removeForum(200);
    }
}
