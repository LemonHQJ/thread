package com.lem.thread2.syn_volatile;

public class MyThread extends Thread{

	public static int count;
	
	private void addCount(){
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println(count);
	}
	
	@Override
	public void run() {
		super.run();
		addCount();
	}
}
