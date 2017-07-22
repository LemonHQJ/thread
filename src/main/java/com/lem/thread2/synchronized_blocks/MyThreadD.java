package com.lem.thread2.synchronized_blocks;

public class MyThreadD extends Thread{
	private ObjectService os;
	
	public MyThreadD(ObjectService os){
		this.os = os;
	}
	
	@Override
	public void run() {
		super.run();
		os.serviceMethodB();
	}
}
