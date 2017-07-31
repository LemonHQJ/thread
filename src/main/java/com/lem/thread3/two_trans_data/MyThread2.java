package com.lem.thread3.two_trans_data;

public class MyThread2 extends Thread {
	
	private Object obj;
	
	public MyThread2(Object obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		super.run();
		synchronized (obj) {
			System.out.println("准备唤醒" + System.currentTimeMillis());
			obj.notify();
		}
	}
}
