package com.lem.thread.suspend_resume;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		while(true){
			if(this.isInterrupted()){
				System.out.println("停止了！！！");
				return;
			}
			System.out.println("timer= " + System.currentTimeMillis());
		}
	}
}
