package com.smoner.aop.proxy.cglibproxy;


import com.smoner.aop.proxy.dymaticproxy.ForumServiceImpl;

public class TestFormuService {

	public static void main(String[] args) {
		com.smoner.aop.proxy.nativeExample.cglib.MyCglibProxy proxy = new com.smoner.aop.proxy.nativeExample.cglib.MyCglibProxy();
		ForumServiceImpl fs = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
		fs.removeForum(10);
		fs.removeTopic(1024);
	}

}
