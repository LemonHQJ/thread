package com.lem.thread3.p_r_test;

public class CThread extends Thread {

	private C1 c1;
	
	public CThread(C1 c){
		this.c1 = c;
	}
	
	public void run(){
		while(true){
			c1.popService();
		}
	}
}
