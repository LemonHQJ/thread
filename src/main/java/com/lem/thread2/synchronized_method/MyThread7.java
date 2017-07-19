package com.lem.thread2.synchronized_method;

public class MyThread7 extends Thread {

	private PublicVar pv;
	
	public MyThread7(PublicVar pv) {
		this.pv = pv;
	}
	
	@Override
	public void run() {
		super.run();
//		demo9
//		pv.setValue("C", "CC");
		pv.getValue();
	}
}
