package com.lem.thread3.wait_release_lock;

public class ThreadB extends Thread{
	private Object obj;
	
	public ThreadB(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		Service ser = new Service();
		ser.testMethod(obj);
	}
}
