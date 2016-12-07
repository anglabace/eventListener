package com.smoner.aop.cglib;

import com.smoner.aop.dymaticproxy.ForumServiceImpl;

public class TestFormuService {

	public static void main(String[] args) {
		MyCglibProxy proxy = new MyCglibProxy();
		ForumServiceImpl fs = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
		fs.removeForum(10);
		fs.removeTopic(1024);
	}

}
