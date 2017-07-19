package com.lem.thread.use_returnI_iterrupt;

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
