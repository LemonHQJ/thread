package com.lem.thread2.syn_volatile;

public class MyThreadB extends Thread{

	private Service ser;
	public MyThreadB(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.stopMethod();
		System.out.println("MyThreadB");
	};
}
