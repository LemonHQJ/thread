package com.lem.thread3.wait_release_lock;

public class ThreadA extends Thread{

	
	private Object obj;
	
	public ThreadA(Object obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		Service ser = new Service();
		ser.testMethod(obj);
	}
}
