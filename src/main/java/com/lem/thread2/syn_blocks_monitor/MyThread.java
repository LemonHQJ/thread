package com.lem.thread2.syn_blocks_monitor;

public class MyThread extends Thread{

	private Service ser;
	
	
	public MyThread(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
//		demo1
//		ser.setUserNamePassword("A", "AA");
//		demo2
//		ser.setUserNamePassword1("A", "AA");
//		demo2_
		ser.sys();
	};
}
