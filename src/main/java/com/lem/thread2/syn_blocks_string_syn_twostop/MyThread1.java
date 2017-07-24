package com.lem.thread2.syn_blocks_string_syn_twostop;

public class MyThread1 extends Thread{

	private Service ser;
	
	public MyThread1(Service ser){
		this.ser = ser;
	}
	
	
	@Override
	public void run() {
		super.run();
		ser.methodA();
	};
}
