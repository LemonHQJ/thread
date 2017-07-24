package com.lem.thread2.syn_blocks_static;

public class MyThreadB extends Thread{

	
	
	public MyThreadB(){
	}
	
	@Override
	public void run() {
		super.run();
		Service.printB();
	};
}
