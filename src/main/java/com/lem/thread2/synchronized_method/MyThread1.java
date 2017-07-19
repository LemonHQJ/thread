package com.lem.thread2.synchronized_method;

public class MyThread1 extends Thread {
	
	private HasSelfPrvateNum1 hspn;
	private HasSelfPrvateNum2 hspn2;
	
	public MyThread1(HasSelfPrvateNum1 hspn){
		this.hspn = hspn;
	}
	public MyThread1(HasSelfPrvateNum2 hspn){
		this.hspn2 = hspn;
	} 
	
//	@Override
//	public void run() {
//		super.run();
//		hspn.addI("b");
//	}
	
	@Override
	public void run() {
		super.run();
		hspn2.addI("b");
	}
}
