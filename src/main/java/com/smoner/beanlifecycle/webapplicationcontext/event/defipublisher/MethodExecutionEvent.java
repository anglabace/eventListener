package com.smoner.beanlifecycle.webapplicationcontext.event.defipublisher;

import org.springframework.context.ApplicationEvent;

public class MethodExecutionEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
    public MethodExecutionEvent(Object source) {   
        super(source);   
    }   
}
