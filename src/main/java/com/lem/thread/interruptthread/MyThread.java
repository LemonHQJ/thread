package com.lem.thread.interruptthread;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5000;i++){
			System.out.println("i= " + (i+1));
			if(i==100){
				for(int j=0;j<1000;j++){
					System.out.println("~~~~~~~~");
					System.out.println(Thread.currentThread().getName());
				}	
			}

		}
	}
}
