package com.lem.thread6.singletonpattern;

public class MyObject2 {
	
	private static MyObject2 mo;


//	懒汉模式
	public static MyObject2 getInstance(){
//		延迟加载
		if(mo != null){
		}else {
			mo = new MyObject2();
		}
		return mo;
	}
}
