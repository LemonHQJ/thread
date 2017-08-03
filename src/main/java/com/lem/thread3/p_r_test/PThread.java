package com.lem.thread3.p_r_test;

public class PThread extends Thread {

	private P1 p1;
	
	public PThread(P1 p1){
		this.p1 = p1;
	}
	
	public void run(){
		while(true){
			p1.pushService();
		}
	}
}
