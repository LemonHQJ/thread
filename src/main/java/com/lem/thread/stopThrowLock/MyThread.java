package com.lem.thread.stopThrowLock;

public class MyThread extends Thread {
	private SynchronizedObject object;
	public MyThread(SynchronizedObject object){
		this.object= object;
	}
	@Override
	public void run() {
		super.run();
		object.print("b", "bb");
	}
}
