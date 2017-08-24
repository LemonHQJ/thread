package com.lem.thread7.state;

public class Main {

	public static void main(String[] args) {
		demo1();
	}
	
	/**
	 * TIMED_WAITING
	 */
	public static void demo1(){
		final Service ser = new Service();
		Thread t1 = new Thread(){
			@Override
			public void run() {
				super.run();
				ser.method();
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			@Override
			public void run() {
				super.run();
				ser.method();
			}
		};
		t2.start();
		System.out.println(t2.getState());
		System.out.println(t1.getState());
	}
}
