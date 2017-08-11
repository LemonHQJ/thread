package com.lem.thread3.join_more_test;

public class ThreadB extends Thread {

	synchronized public void run(){
		try {
			System.out.println("ThreadB  begin" + Thread.currentThread() + "   " + System.currentTimeMillis());
			Thread.sleep(10000);
			System.out.println("ThreadB  end" + Thread.currentThread() + "   " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
