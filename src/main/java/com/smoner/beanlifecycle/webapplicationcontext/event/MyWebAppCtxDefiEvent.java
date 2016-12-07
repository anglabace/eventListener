package com.smoner.beanlifecycle.webapplicationcontext.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyWebAppCtxDefiEvent extends ApplicationContextEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyWebAppCtxDefiEvent(ApplicationContext source) {
		super(source);
	}

	/**
	 * 
	 */

}
