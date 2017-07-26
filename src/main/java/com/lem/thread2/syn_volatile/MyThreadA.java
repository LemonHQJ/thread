package com.lem.thread2.syn_volatile;

public class MyThreadA extends Thread{

	private Service ser;
	public MyThreadA(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.run();
	};
}
