package com.lem.thread2.synchronized_blocks;

public class MyThread extends Thread {
	
	private Task task;
	public MyThread(Task task){
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
	
}
