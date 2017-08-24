package com.lem.thread7.state;

public class Service {

	synchronized public void method(){
		try {
			System.out.println("   begin   method");
			Thread.sleep(10000);
			System.out.println("   end   method");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
