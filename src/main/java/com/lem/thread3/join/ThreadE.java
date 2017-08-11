package com.lem.thread3.join;

public class ThreadE extends Thread {
	
	private Service ser;
	
	public ThreadE(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.run();
	}
}
