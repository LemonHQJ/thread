package com.lem.thread4.usercondition;

public class MyThreadA extends Thread {

	private MyService ms;
	
	public MyThreadA(MyService ms){
		this.ms = ms;
	}
	
	@Override
	public void run() {
		super.run();
//		demo1
//		ms.waitMethod();
//		demo2
//		ms.awit();
		
//		demo3
//		ms.awaitA();
		
//		demo4
//		ms.await_A();
		
//		demo5
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			ms.set();
		}
	
	}
}
