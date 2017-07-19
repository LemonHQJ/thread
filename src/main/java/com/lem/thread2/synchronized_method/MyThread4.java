package com.lem.thread2.synchronized_method;

public class MyThread4 extends Thread {

	private MyObject mo;
	
	public MyThread4(MyObject mo){
		this.mo = mo;
	}
	
	public void run(){
		mo.method();
	}
	
}
