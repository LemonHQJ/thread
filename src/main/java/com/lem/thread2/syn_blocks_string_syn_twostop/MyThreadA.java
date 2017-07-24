package com.lem.thread2.syn_blocks_string_syn_twostop;

public class MyThreadA extends Thread{

	
	
	public MyThreadA(){
	}
	
	
	@Override
	public void run() {
		super.run();
		Service.print("AA");
	};
}
