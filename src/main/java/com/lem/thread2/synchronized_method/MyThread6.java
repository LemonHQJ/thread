package com.lem.thread2.synchronized_method;

public class MyThread6 extends Thread{

	
	private PublicVar pv;
	
	public MyThread6(PublicVar pv){
		this.pv = pv;
	}
	
	
	@Override
	public void run() {
		super.run();
		pv.setValue("B", "BB");
	}
}
