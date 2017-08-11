package com.lem.thread3.threadlocal;

public class MyThread extends Thread {

	@Override
	public void run() {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("MyThread 取值 = " + Tools.te1.get());
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
