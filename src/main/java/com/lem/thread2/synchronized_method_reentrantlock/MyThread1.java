package com.lem.thread2.synchronized_method_reentrantlock;

public class MyThread1 extends Thread {

	private SS sub ;
	
	public MyThread1(SS sub) {
		this.sub = sub;
	}
	
	@Override
	public void run() {
		super.run();
		sub.operateISubMethod();
	}

}
