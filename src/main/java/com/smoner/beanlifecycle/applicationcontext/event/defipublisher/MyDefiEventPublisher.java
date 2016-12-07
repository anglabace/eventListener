package com.smoner.beanlifecycle.applicationcontext.event.defipublisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyDefiEventPublisher implements ApplicationEventPublisherAware {

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher=applicationEventPublisher;
	}
    private ApplicationEventPublisher eventPublisher;  
    
    public void methodToMonitor() {  
    	MethodExecutionEvent beginEvent = new MethodExecutionEvent("MethodExecutionEvent--Test");  
        this.eventPublisher.publishEvent(beginEvent);  
    }
}
