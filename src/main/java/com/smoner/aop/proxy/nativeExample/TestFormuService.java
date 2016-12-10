package com.smoner.aop.proxy.nativeExample;
/**
 * 原生代码测试
 */
public class TestFormuService {

	public static void main(String[] args) {
		ForumService fs = new ForumServiceImpl();
		fs.removeForum(10);
		fs.removeTopic(1024);
	}

}
