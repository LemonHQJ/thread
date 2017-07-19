package com.lem.thread2.synchronized_method;

public class MyThread5 extends Thread {
	
	private MyObject mo;
	
	public MyThread5(MyObject mo){
		this.mo = mo;
	}
	
	public void run(){
		mo.methodB();
	}

}
