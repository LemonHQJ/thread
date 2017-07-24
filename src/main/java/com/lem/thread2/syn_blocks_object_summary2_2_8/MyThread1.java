package com.lem.thread2.syn_blocks_object_summary2_2_8;

public class MyThread1 extends Thread{
	
	private MyObject mo;
	
	public MyThread1(MyObject mo){
		this.mo = mo;
	}
	
	@Override
	public void run() {
		super.run();
		mo.print();
	}

}
