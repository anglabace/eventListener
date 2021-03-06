package com.smoner.beanlifecycle.webapplicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smoner.beanlifecycle.webapplicationcontext.event.MyWebAppCtxDefiEvent;
import com.smoner.beanlifecycle.webapplicationcontext.event.defipublisher.MyDefiEventPublisher;

@Controller
public class Car2 implements ApplicationContextAware{
	private ApplicationContext context ;
	private String brand;
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private String color;
	private int maxSpeed;
	
	
	public String getBrand() {
		System.out.println("调用getBrand()方法获取brand属性值。");
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("调用setBrand()方法设置brand属性值。");
		this.brand = brand;
	}
	public String getColor() {
		System.out.println("调用getColor()方法获取color属性值。");
		return color;
	}
	public void setColor(String color) {
		System.out.println("调用setColor()方法设置color属性值。");
		this.color = color;
	}
	public Car2(){
		System.out.println("调用Car构造函数。");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
	}
	@RequestMapping("/defievent")
	public String publishEvent(){
		MyWebAppCtxDefiEvent e = new MyWebAppCtxDefiEvent(this.context);
		this.context.publishEvent(e);
		MyDefiEventPublisher evtpublisher =(MyDefiEventPublisher)this.context.getBean("myDefiEventPublisher");
		evtpublisher.methodToMonitor();
		return "index";
	}
}
