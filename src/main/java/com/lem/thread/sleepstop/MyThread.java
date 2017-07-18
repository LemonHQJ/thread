package com.lem.thread.sleepstop;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("run  begin");
			Thread.sleep(200000);
			System.out.println("run  end");
		} catch (Exception e) {
			System.out.println("在沉睡中被停止！进入catch		"+ this.isInterrupted());
			e.printStackTrace();
		}
	}
}
