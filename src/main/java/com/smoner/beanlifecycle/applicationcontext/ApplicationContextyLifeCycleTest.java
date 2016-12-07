package com.smoner.beanlifecycle.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smoner.beanlifecycle.applicationcontext.event.defipublisher.MyDefiEventPublisher;

public class ApplicationContextyLifeCycleTest {
	private static void ListCycleInBeanFactory(){
		ApplicationContext bf = new  ClassPathXmlApplicationContext("com/smoner/beanlifecycle/applicationcontext/spring.xml");
		
		Car car1 = (Car)bf.getBean("car");
		car1.introduce();
		car1.setColor("红色");
		
		Car2 car2 = (Car2)bf.getBean("car2");
		car2.publishEvent();
//		System.out.println("car1==car2:"+(car1==car2));
		MyDefiEventPublisher publisher = (MyDefiEventPublisher)bf.getBean("myDefiEventPublisher");   
		publisher.methodToMonitor();  
//		((ClassPathXmlApplicationContext)bf).refresh();
		((ClassPathXmlApplicationContext)bf).stop();
		((ClassPathXmlApplicationContext)bf).start();
		((ClassPathXmlApplicationContext)bf).close();
		
	}
	public static void main(String[] args) {
		ListCycleInBeanFactory();
	}
}
