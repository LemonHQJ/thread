package com.lem.thread4.usercondition;

public class MyThreadB extends Thread {

	private MyService ms;
	
	public MyThreadB(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
		
//		demo3
//		ms.awaitB();
		
//		demo4
//		ms.await_B();
		
//		demo5
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			ms.get();
		}
	}
}
