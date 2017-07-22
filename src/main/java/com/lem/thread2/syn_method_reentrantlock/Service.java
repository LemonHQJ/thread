package com.lem.thread2.syn_method_reentrantlock;

public class Service {

	public Service() {
	}
	
	synchronized public void service1(){
		
		System.out.println("service1");
		service2();
	}

	synchronized public void service2(){
		System.out.println("service2");
//		service3();
	}

	
	synchronized public void service3(){
		System.out.println("service3");
	}

}
