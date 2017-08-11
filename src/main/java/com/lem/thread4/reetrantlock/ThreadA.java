package com.lem.thread4.reetrantlock;

public class ThreadA extends Thread {

	private MyService ms;
	
	public ThreadA(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		ms.testMethod();
	}
}
