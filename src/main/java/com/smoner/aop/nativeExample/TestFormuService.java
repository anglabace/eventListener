package com.smoner.aop.nativeExample;

public class TestFormuService {

	public static void main(String[] args) {
		ForumService fs = new ForumServiceImpl();
		fs.removeForum(10);
		fs.removeTopic(1024);
	}

}
