package com.lem.thread6.singletonpattern;

public class MyObject {

//	饥饿模式
	private static MyObject mo = new MyObject();
	
	public static MyObject getInstance(){
//		此版本为立即加载
//		缺点：是不能有其他实例变量
//		因为getInstance()方法没有同步，所以可能出现非线程安全问题
		return mo;
	}
}
