package com.lem.thread3.threadlocal;

public class ThreadB extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Tools.add("ThreadB " + i);
			System.out.println("ThreadB :  " + Tools.t1.get());
		}
	}
}
