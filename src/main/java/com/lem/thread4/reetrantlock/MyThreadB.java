package com.lem.thread4.reetrantlock;

public class MyThreadB extends Thread{

	private MyService ms;
	
	public MyThreadB(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		ms.methodB();
	}
}
