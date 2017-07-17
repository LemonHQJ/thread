package com.lem.thread.base;

public class MyThread extends Thread {

	private String name;
	
	private int count=5;
	
	public MyThread(String name){
		this.name = name;
	}
	
//	demo3
//	@Override
//	public void run() {
//		super.run();
//		count--;
//		System.out.println(Thread.currentThread().getName() + "  count : " + count);
//	}
//	demo4 共享同步
	synchronized public void run(){
		super.run();
		count--;
		System.out.println(Thread.currentThread().getName() + "  count : " + count);
	}
}
