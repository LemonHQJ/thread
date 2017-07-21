package com.lem.thread2.synchronized_blocks;

public class MyThreadA extends Thread {

private ObjectService os;
	
	public MyThreadA(ObjectService os){
		this.os = os;
	}
	
	@Override
	public void run() {
		super.run();
		os.serviceMethod();
	}
}
