package com.smoner.beanlifecycle.applicationcontext.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class MyAppContextClosedEventListener implements
		ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		String ss = "";
	}
}
