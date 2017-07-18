package com.lem.thread.sleepstop;

public class MyThread1 extends Thread {
	
	private int i = 0;
	
	
	@Override
	public void run() {
		super.run();
		try {
			while(true){
				i++;
				System.out.println("i=" + i);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
