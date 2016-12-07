package com.smoner.beanlifecycle.applicationcontext.event;

import org.springframework.context.ApplicationListener;

public class MyDefiEventListener implements ApplicationListener<MyDefiEvent> {

	@Override
	public void onApplicationEvent(MyDefiEvent event) {
		System.out.println("执行事件：MyDefiEvent");
	}
}
