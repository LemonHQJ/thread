package com.lem.thread2.synchronized_blocks;

public class MyThread extends Thread {
	
//	private Task task;
	
//	同步代码块
	private Task_ task_;
//	public MyThread(Task task){
//		super();
//		this.task = task;
//	}
	
	public MyThread(Task_ task_){
		super();
		this.task_ = task_;
	}
//	@Override
//	public void run() {
//		super.run();
//		CommonUtils.beginTime1 = System.currentTimeMillis();
//		task.doLongTimeTask();
//		CommonUtils.endTime1 = System.currentTimeMillis();
//	}
	
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task_.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
	
}
