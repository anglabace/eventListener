package com.smoner.beanlifecycle.applicationcontext.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class MyAppContextStoppedEventListener implements
		ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		String ss = "";
	}
}
