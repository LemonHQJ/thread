package com.lem.thread4.reetrantlock;

public class MyThreadA extends Thread{

	private MyService ms;
	
	public MyThreadA(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		ms.methodA();
	}
}
