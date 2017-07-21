package com.lem.thread2.synchronized_blocks;

public class ObjectService {
	
	public void serviceMethod(){
		synchronized (this) {
			System.out.println("begin time = " + System.currentTimeMillis());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end	  time = " + System.currentTimeMillis());
		}
	}

}
