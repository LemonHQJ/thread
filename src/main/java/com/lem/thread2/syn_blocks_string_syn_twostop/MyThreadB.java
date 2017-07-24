package com.lem.thread2.syn_blocks_string_syn_twostop;

public class MyThreadB extends Thread{

	
	public MyThreadB(){
	}
	
	@Override
	public void run() {
		super.run();
		Service.print("AA");
	};
}
