package com.lem.thread2.synchronized_blocks;

public class MyThreadB extends Thread {
	private ObjectService os;
	
	public MyThreadB(ObjectService os){
		this.os = os;
	}
	
	@Override
	public void run() {
		super.run();
		os.serviceMethod();
	}
}
