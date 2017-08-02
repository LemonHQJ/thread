package com.lem.thread3.wait_release_lock;

public class NotifyThread extends Thread {

	private Object obj;

	public NotifyThread(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		Service ser = new Service();
		ser.testNotifyMethod1(obj);
	}
}
