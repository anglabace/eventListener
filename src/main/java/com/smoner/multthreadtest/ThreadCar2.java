package com.smoner.multthreadtest;


public class ThreadCar2 {
	final Object postProcessingLock = new Object();

	public synchronized void registerExternallyManagedInitMethod() {
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
	}

	public synchronized void isExternallyManagedInitMethod() {
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
			int j = 0;
			for(int i =0 ;i<999000000;i++){
				j+=1;
			}
			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
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
		
		  
		
		ThreadCar2 car = new ThreadCar2();
		ThreadCar2 car2 = new ThreadCar2();
		ThreadCar2.InnerThread2 t1 = car.new InnerThread2("t1",1);
		ThreadCar2.InnerThread2 t2 = car2.new InnerThread2("t2",2);
		
		Thread thread1 = new Thread(t1);  
		thread1.start();
		
		Thread thread2 = new Thread(t2);  
		thread2.start();
	}

	protected class InnerThread2 implements Runnable{
		String threadname = null;
		int code = 0;
		public InnerThread2(String name,int num){
			this.threadname = name;
			this.code = num;
		}
		
		@Override
		public void run() {
//			System.out.println(Thread.currentThread().getId()+":"+System.currentTimeMillis());
//			Thread current = Thread.currentThread();  
//	        System.out.println(threadname+":"+current.getPriority());  
//	        System.out.println(threadname+":"+current.getName());  
//	        System.out.println(threadname+":"+current.activeCount());  
//	        System.out.println(threadname+":"+current.getId());  
//	        System.out.println(threadname+":"+current.getThreadGroup());  
//	        System.out.println(threadname+":"+current.getStackTrace());  
//	        System.out.println(threadname+":"+current.hashCode());  
//	        System.out.println(threadname+":"+current.toString()); 
			if(code ==1){
				isExternallyManagedInitMethod();
			}else if(code==2){
				registerExternallyManagedInitMethod();
			}
		}
	}
}
