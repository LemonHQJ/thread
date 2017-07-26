package com.lem.thread.base;

public class MyThreadA extends Thread{
	
	private Service ser;
	
	public MyThreadA(Service ser){
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
