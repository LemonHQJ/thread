package com.lem.thread2.syn_blocks_string_syn_twostop;

public class MyThread2 extends Thread{

	private Service ser;
	
	public MyThread2(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.methodB();
	};
}
