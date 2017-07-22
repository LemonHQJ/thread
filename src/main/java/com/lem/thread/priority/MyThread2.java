package com.lem.thread.priority;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread2 run= "+this.getPriority());
	}
}
