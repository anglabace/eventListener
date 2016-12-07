package com.smoner.beanlifecycle.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
	private String brand;
	public void introduce(){
		System.out.println("brand:"+this.brand+";color:"+this.color+";maxSpeed:"+this.maxSpeed);
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private String color;
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	private String beanName ;
	
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
	public Car(){
		System.out.println("调用Car构造函数。");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destroy()方法。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean.afterPropertiesSet()方法。");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("调用BeanNameFactoryAware.setBeanName()。");
		this.beanName = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactoryAware.setBeanFactory()。");
		this.beanFactory=beanFactory;
	}

	public void myInit(){
		System.out.println("调用init-method所指定的myInit(),将maxSpeed设置为240。");
		this.maxSpeed = 240;
	}
	public void myDestroy(){
		System.out.println("调用destroy-method所指定的myDestroy()。");
	}
}
