package com.lem.thread4.reetrantlock;

public class MyThreadAA extends Thread{

	private MyService ms;
	
	public MyThreadAA(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		ms.methodA();
	}
}
