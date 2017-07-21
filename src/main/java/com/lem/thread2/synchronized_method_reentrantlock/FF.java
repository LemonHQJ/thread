package com.lem.thread2.synchronized_method_reentrantlock;

public class FF {
	public int i=10;
	
	synchronized public void operateIMainMethod(){
		try {
			i--;
			System.out.println("Father print i= "+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
