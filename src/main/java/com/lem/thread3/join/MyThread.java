package com.lem.thread3.join;

public class MyThread extends Thread {

//	demo1
//	@Override
//	public void run() {
//		try {
//			super.run();
//			int secondValue = (int) (Math.random()*10000);
//			System.out.println(secondValue);
//			Thread.sleep(secondValue);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
//	demo4
	@Override
	public void run() {
		try {
			System.out.println("Mt   " + System.currentTimeMillis());
			Thread.sleep(10000);
			System.out.println("Mt   " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
