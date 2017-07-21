package com.lem.thread2.synchronized_blocks;

public class Main {

	public static void main(String[] args) {
		demo1();
	}
	
	/**
	 * synchronized方法 弊端
	 * 万一main中sleep不是10000,数据不对
	 */
	public static void demo1(){
		Task task = new Task();
		MyThread thread1 = new MyThread(task);
		MyThread2 thread2 = new MyThread2(task);
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(10000);
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
	 * 
	 */
	public static void demo2(){
		
	}
}
