package com.lem.thread2.synchronized_mth.syn_not_ext;

public class MyThreadA extends Thread {


	private Sub sub;
	
	public MyThreadA(Sub sub) {
		this.sub = sub;
	}

	@Override
	public void run() {
		super.run();
		sub.serviceMethod();
	}

}
