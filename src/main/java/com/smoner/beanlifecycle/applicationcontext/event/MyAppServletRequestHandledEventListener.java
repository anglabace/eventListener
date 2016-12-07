package com.smoner.beanlifecycle.applicationcontext.event;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

public class MyAppServletRequestHandledEventListener implements
		ApplicationListener<RequestHandledEvent> {

	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		String ss = "";
	}
}
