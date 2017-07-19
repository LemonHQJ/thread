package com.lem.thread2.synchronized_method;

public class MyThread extends Thread {

	private HasSelfPrvateNum hspn;
	
	private String name;
	public MyThread(HasSelfPrvateNum hspn,String name){
		this.hspn = hspn;
		this.name = name;
	}
	
	@Override
	public void run() {
		super.run();
		hspn.addI(name);
	}
}
