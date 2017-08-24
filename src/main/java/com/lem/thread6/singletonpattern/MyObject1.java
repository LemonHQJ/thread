package com.lem.thread6.singletonpattern;

public class MyObject1 {
	
	private static MyObject1 mo;


//	懒汉模式
	public static MyObject1 getInstance(){
//		延迟加载
		if(mo != null){
		}else {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mo = new MyObject1();
		}
		return mo;
	}
}
