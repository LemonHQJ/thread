package com.lem.thread2.syn_blocks_static_inner;

public class MyThreadC extends Thread{

	private Service ser;
	public MyThreadC(Service ser){
		this.ser = ser;
	}
	
	@Override
	public void run() {
		super.run();
		ser.printC();
	};
}
