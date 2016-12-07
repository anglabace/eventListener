package com.smoner.beanlifecycle.applicationcontext.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyDefiEvent extends ApplicationContextEvent{

	public MyDefiEvent(ApplicationContext source) {
		super(source);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
