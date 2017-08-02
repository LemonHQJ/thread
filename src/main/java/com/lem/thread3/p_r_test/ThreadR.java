package com.lem.thread3.p_r_test;

public class ThreadR extends Thread {

	private C c;
	
	public ThreadR(C c){
		this.c = c;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			c.getValue();
		}
	}
}
