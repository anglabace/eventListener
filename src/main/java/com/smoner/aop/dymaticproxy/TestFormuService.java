package com.smoner.aop.dymaticproxy;

import java.lang.reflect.Proxy;

import com.smoner.aop.nativeExample.ForumService;

public class TestFormuService {

	public static void main(String[] args) {
		ForumService fs = new ForumServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(fs);
		ForumService proxy = (ForumService)Proxy.newProxyInstance(fs.getClass().getClassLoader(), fs.getClass().getInterfaces(), handler);
		proxy.removeForum(10);
		proxy.removeTopic(1024);
	}

}
