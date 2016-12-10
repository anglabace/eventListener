package com.smoner.aop.proxy.dymaticproxy;

import com.smoner.aop.proxy.nativeExample.ForumService;
import java.lang.reflect.Proxy;

public class TestFormuService {

	public static void main(String[] args) {
		ForumService fs = new ForumServiceImpl();
		PerformanceHandler handler = new PerformanceHandler(fs);
		ForumService proxy = (ForumService) Proxy.newProxyInstance(fs.getClass().getClassLoader(), fs.getClass().getInterfaces(), handler);
		proxy.removeForum(10);
		proxy.removeTopic(1024);
	}

}
