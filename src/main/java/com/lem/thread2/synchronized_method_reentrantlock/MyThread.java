package com.lem.thread2.synchronized_method_reentrantlock;

public class MyThread extends Thread{

	private Service service;
	
	public MyThread(Service service){
		this.service = service;
	}
	
	public void run(){
		service.service1();
	}
}
