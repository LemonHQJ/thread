package com.lem.thread3.join_more_test;

public class ThreadA extends Thread {

	private ThreadB tb;
	
	public ThreadA(ThreadB tb){
		this.tb = tb;
	}
	
	@Override
	public void run() {
		try {
			synchronized (tb) {
				System.out.println("ThreadA  begin" + Thread.currentThread() + "   " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("ThreadA  end" + Thread.currentThread() + "   " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
