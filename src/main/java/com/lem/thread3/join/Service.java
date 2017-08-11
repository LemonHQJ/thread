package com.lem.thread3.join;

public class Service extends Thread {

	
	synchronized public void run(){
		try {
			System.out.println("Service  run" + Thread.currentThread() + "   " + System.currentTimeMillis());
			Thread.sleep(10000);
			System.out.println("Service  run" + Thread.currentThread() + "   " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void method(){
		System.out.println("Service  method" + Thread.currentThread() + "   " + System.currentTimeMillis());

	}
}
