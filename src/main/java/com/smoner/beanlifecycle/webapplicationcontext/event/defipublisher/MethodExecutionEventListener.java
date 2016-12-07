package com.smoner.beanlifecycle.webapplicationcontext.event.defipublisher;

import org.springframework.context.ApplicationListener;

public class MethodExecutionEventListener implements ApplicationListener<MethodExecutionEvent> {

	@Override
	public void onApplicationEvent(MethodExecutionEvent event) {
		System.out.println("执行事件：MethodExecutionEvent");
	}
}
