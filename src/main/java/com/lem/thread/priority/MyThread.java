package com.lem.thread.priority;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread run priority= "+this.getPriority());
		MyThread2  mt2 = new MyThread2();
		mt2.start();
		System.out.println("MyThread run  MyThread2-priority= "+this.getPriority());
	}
}
