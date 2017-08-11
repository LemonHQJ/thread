package com.lem.thread3.threadlocal;

public class ThreadA extends Thread {

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				Tools.add("ThreadA " + i);
				System.out.println("ThreadA :  " + Tools.t1.get());
			}
		}
		
	}
}
