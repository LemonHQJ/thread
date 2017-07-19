package com.lem.thread.same_num;

public class MyThread extends Thread{
	
	private int count=5;
	
	public void run(){
		System.out.println("count= " + (count--) + "  threadName: " +Thread.currentThread().getName());
	}

}
