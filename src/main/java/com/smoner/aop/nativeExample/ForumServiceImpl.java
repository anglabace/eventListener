package com.smoner.aop.nativeExample;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topicid) {
		PerformanceMonitor.begin("com.smoner.aop.nativeExample.ForumServiceImpl.removeTopic(int)");
		System.out.println("模拟删除Topic记录："+topicid);
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		PerformanceMonitor.end();
	}

	@Override
	public void removeForum(int forumid) {
		PerformanceMonitor.begin("com.smoner.aop.nativeExample.ForumServiceImpl.removeForum(int)");
		System.out.println("模拟删除forum记录："+forumid);
		try {
			Thread.currentThread().sleep(40);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		PerformanceMonitor.end();
	}

}
