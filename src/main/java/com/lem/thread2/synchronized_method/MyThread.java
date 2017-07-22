package com.lem.thread2.synchronized_method;

//import cn.joy.framework.kits.StringKit;

public class MyThread extends Thread {

	private HasSelfPrvateNum hspn;
	
	private HasSelfPrvateNum1 hspn1;
	
	private HasSelfPrvateNum2 hspn2;
	
	private String name;
	public MyThread(HasSelfPrvateNum hspn,String name){
		this.hspn = hspn;
		this.name = name;
	}
	
	public MyThread(HasSelfPrvateNum1 hspn){
		this.hspn1 = hspn;
	}
	
	public MyThread(HasSelfPrvateNum2 hspn){
		this.hspn2 = hspn;
	}
	
//	@Override
//	public void run() {
//		super.run();
//		hspn.addI(name);
//	}
	
//	@Override
//	public void run() {
//		super.run();
//		hspn1.addI("a");
//	}
	
	@Override
	public void run() {
		super.run();
		hspn2.addI("a");
	}
}
