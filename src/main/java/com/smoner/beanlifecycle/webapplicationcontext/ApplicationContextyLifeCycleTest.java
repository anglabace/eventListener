package com.smoner.beanlifecycle.webapplicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class ApplicationContextyLifeCycleTest {
	private static void ListCycleInBeanFactory(){
//		WebApplicationContext bf = new  ClassPathXmlApplicationContext("com/smoner/beanlifecycle/applicationcontext/spring.xml");
		
//		Car car1 = (Car)bf.getBean("car");
//		car1.introduce();
//		car1.setColor("红色");
//		
//		Car2 car2 = (Car2)bf.getBean("car2");
//		car2.publishEvent();
//		((ClassPathXmlApplicationContext)bf).refresh();
//		((ClassPathXmlApplicationContext)bf).stop();
//		((ClassPathXmlApplicationContext)bf).start();
//		((ClassPathXmlApplicationContext)bf).close();
	}
	public static void main(String[] args) {
		ListCycleInBeanFactory();
	}
}
