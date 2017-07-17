package com.lem.thread.interruptthread;

public class Main {

	public static void main(String[] args) {
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(10000);
			mt.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
