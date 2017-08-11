package com.lem.thread3.join;

public class ThreadA extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println(i+"");
		}
	}
}
