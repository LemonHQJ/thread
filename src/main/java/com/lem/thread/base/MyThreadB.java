package com.lem.thread.base;

public class MyThreadB extends Thread{
	
	private Service ser;
	
	public MyThreadB(Service ser){
		this.ser = ser;
	}
	
	
	@Override
	public void run() {
		super.run();
//		for (int i = 0; i < 4; i++) {
			ser.method();
//		}

	}

}
