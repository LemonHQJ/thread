package com.lem.thread2.syn_blocks_object_summary2_2_8;

public class MyThread extends Thread{
	private Service ser;
	
	private MyObject mo;
	
	public MyThread(Service ser,MyObject mo){
		this.mo = mo;
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.testMethod(mo);
	}

}
