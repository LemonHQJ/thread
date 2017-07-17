package com.lem.thread.base;

public class MyRunnable implements Runnable {

	private int count = 5;
	//不共享
//	public void run() {
//		while(count>0){
//			count--;
//			System.out.println(Thread.currentThread().getName()+"count :"+ count );
//		}
//	}
	
	//共享
	public void run() {
			count--;
			System.out.println(Thread.currentThread().getName()+"count :"+ count );
	}
	

}
