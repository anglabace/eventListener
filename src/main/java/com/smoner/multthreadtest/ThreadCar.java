package com.smoner.multthreadtest;

import com.smoner.multthreadtest.ThreadCar2.InnerThread2;


public class ThreadCar {
	final  Object postProcessingLock = new Object();

	public void registerExternallyManagedInitMethod() {
		synchronized (this.postProcessingLock) {
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
		}
	}

	public void isExternallyManagedInitMethod() {
		synchronized (this.postProcessingLock) {
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
			int j = 0;
			for(int i =0 ;i<999000000;i++){
				j+=1;
			}
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
		}
	}

	public static void main(String[] args) {
//		// 打印的是毫秒级
//		System.out.println(System.currentTimeMillis());
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(System.currentTimeMillis());
		
		ThreadCar car = new ThreadCar();
//		ThreadCar car2 = new ThreadCar();
		ThreadCar.InnerThread t1 = car.new InnerThread("t1",1);
		ThreadCar.InnerThread t2 = car.new InnerThread("t2",2);
		
		Thread thread1 = new Thread(t1);  
		thread1.start();
		
		Thread thread2 = new Thread(t2);  
		thread2.start();
	}

	protected class InnerThread implements Runnable{
		String threadname = null;
		int code = 0;
		public InnerThread(String name,int num){
			this.threadname = name;
			this.code = num;
		}
		
		@Override
		public void run() {
			if(code ==1){
				isExternallyManagedInitMethod();
			}else if(code==2){
				registerExternallyManagedInitMethod();
			}
		}
	}
}
