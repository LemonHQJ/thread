package com.lem.thread.base;

public class Service {
	
	public void method(){
		for(int i=0;i<4;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(Thread.currentThread().getName());
		}
	}
	

}
