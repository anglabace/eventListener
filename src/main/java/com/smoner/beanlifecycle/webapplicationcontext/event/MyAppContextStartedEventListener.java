package com.smoner.beanlifecycle.webapplicationcontext.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class MyAppContextStartedEventListener implements
		ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		String ss = "";
	}
}
