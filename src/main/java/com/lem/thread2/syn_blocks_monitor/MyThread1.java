package com.lem.thread2.syn_blocks_monitor;

public class MyThread1 extends Thread{
private Service ser;
	
	
	public MyThread1(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
//		demo1
//		ser.setUserNamePassword("B", "BB");
//		demo2
		ser.setUserNamePassword1("B", "BB");
	}
}
