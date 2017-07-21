package com.lem.thread2.synchronized_blocks;

public class Main {

	public static void main(String[] args) {
//		demo1();
//		demo1_();
		demo3();
	}
	
	/**
	 * synchronized方法 弊端
	 * 
	 */
	public static void demo1(){
//		Task task = new Task();
//		MyThread thread1 = new MyThread(task);
//		MyThread2 thread2 = new MyThread2(task);
//		thread1.start();
//		thread2.start();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//		}
//		long beginTime = CommonUtils.beginTime1;
//		if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
//			beginTime = CommonUtils.beginTime2;
//		}
//		long endTime = CommonUtils.endTime1;
//		if(CommonUtils.endTime2 < CommonUtils.endTime1){
//			beginTime = CommonUtils.endTime2;
//		}
//		System.out.println("耗时 ： " + (endTime - beginTime)/1000);
	}
	
	
	/**
	 * 同步块
	 * 
	 */
	public static void demo2(){
		ObjectService os = new ObjectService();
		MyThreadA mta = new MyThreadA(os);
		MyThreadB mtb = new MyThreadB(os);
		
	}
	
	/**
	 * 用同步代码块处理demo1
	 * 同步代码:获得对象锁 ,同步
	 */
	public static void demo1_(){
		Task_ task = new Task_();
		MyThread thread1 = new MyThread(task);
		MyThread2 thread2 = new MyThread2(task);
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		}
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime2 < CommonUtils.endTime1){
			beginTime = CommonUtils.endTime2;
		}
		System.out.println("耗时 ： " + (endTime - beginTime)/1000);
	}
	
	/**
	 * 同步代码块交叉/同步
	 * 书：交叉时间更快。。
	 */
	public static void demo3(){
		MyTask mt = new MyTask();
		MyThread3 t1 = new MyThread3(mt);
		MyThread4 t2 = new MyThread4(mt);
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
