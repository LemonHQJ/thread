package com.lem.thread2.synchronized_blocks;

public class MyThreadC extends Thread{
	private ObjectService os;
	
	public MyThreadC(ObjectService os){
		this.os = os;
	}
	
	@Override
	public void run() {
		super.run();
		os.serviceMethodA();
	}
}
