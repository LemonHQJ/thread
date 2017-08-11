package com.lem.thread3.join;

public class ThreadD extends Thread {

	private Service ser;
	
	public ThreadD(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		ser.run();
	}
}
