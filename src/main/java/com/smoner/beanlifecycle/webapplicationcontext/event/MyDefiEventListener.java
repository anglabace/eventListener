package com.smoner.beanlifecycle.webapplicationcontext.event;

import org.springframework.context.ApplicationListener;

public class MyDefiEventListener implements ApplicationListener<MyWebAppCtxDefiEvent> {

	@Override
	public void onApplicationEvent(MyWebAppCtxDefiEvent event) {
		System.out.println("执行事件：MyWebAppCtxDefiEvent");
	}
}
