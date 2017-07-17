package com.lem.thread.currentthreadsleepgetid;

public class MyThread1 extends Thread {


	public void run(){
		System.out.println("run------------this.currentThread().getName()= " + this.currentThread().getName() + "begin");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run------------threadName= " + this.currentThread().getName() + "end");
	}
}
