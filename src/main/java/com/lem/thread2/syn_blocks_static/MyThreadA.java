package com.lem.thread2.syn_blocks_static;

public class MyThreadA extends Thread{

	
	
	public MyThreadA(){
	}
	
	@Override
	public void run() {
		super.run();
		Service.printA();
	};
}
