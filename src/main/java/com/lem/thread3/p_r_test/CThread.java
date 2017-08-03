package com.lem.thread3.p_r_test;

public class CThread extends Thread {

	private C1 c1;
	
	public CThread(C1 c1){
		this.c1 = c1;
	}
	
	public void run(){
		while(true){
			c1.popService();
		}
	}
}
