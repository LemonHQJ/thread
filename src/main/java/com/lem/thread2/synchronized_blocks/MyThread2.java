package com.lem.thread2.synchronized_blocks;

public class MyThread2 extends Thread {
	
//	private Task task;
	
//	同步代码块
	private Task_ task_;
	public MyThread2(Task_ task_){
		super();
		this.task_ = task_;
	}
	
//	@Override
//	public void run() {
//		super.run();
//		CommonUtils.beginTime2 = System.currentTimeMillis();
//		task.doLongTimeTask();
//		CommonUtils.endTime2 = System.currentTimeMillis();
//	}
	
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task_.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
	
}
