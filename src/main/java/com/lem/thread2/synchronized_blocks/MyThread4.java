package com.lem.thread2.synchronized_blocks;

public class MyThread4 extends Thread {

	
	private MyTask mytask;
	
	public MyThread4(MyTask mytask){
		this.mytask = mytask;
	}
	
	@Override
	public void run() {
		super.run();
		mytask.doLongTimeTask();
	}
}
