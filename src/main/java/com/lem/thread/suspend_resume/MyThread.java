package com.lem.thread.suspend_resume;

public class MyThread extends Thread {

	private long i=0;
	
//	demo3
//	@Override
//	public void run() {
//		while(true){
//			i++;
//		}
//	}

	@Override
	public void run() {
		super.run();
		while(true){
			i++;
			System.out.println("i= "+i);
		}
	}
	
	public Long getI() {
		return i;
	}


	public void setI(Long i) {
		this.i = i;
	}
}
