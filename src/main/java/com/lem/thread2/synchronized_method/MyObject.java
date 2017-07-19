package com.lem.thread2.synchronized_method;

public class MyObject {
	
//	demo5
//	public void method(){
//		try {
//			System.out.println("begin method Thread.name " + Thread.currentThread().getName());
//			Thread.sleep(1000);
//			System.out.println("end method ");
//
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	demo6
	synchronized public void method(){
		try {
			System.out.println("begin method Thread.name " + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("end method ");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	demo7
//	public void methodB(){
//		try {
//			System.out.println("begin methodB Thread.name " + Thread.currentThread().getName());
//			Thread.sleep(1000);
//			System.out.println("end method ");
//		} catch (InterruptedException e) {
//		e.printStackTrace();
//		}
//	}
	
	
//	demo8
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB Thread.name " + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("end method ");
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
}
