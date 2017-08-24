package com.lem.thread6.singletonpattern;

public class MyObject3 {
	
	private volatile static MyObject3 mo;


	public static MyObject3 getInstance(){
		if(mo != null){
		}else {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (MyObject3.class) {
				if(mo == null){
					mo = new MyObject3();
				}
			}
		}
		return mo;
	}
}
