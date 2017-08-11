package com.lem.thread4.reetrantlock;

public class MyThreadBB extends Thread{

	private MyService ms;
	
	public MyThreadBB(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		ms.methodB();
	}
}
