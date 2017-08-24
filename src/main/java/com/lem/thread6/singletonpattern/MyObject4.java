package com.lem.thread6.singletonpattern;

public class MyObject4 {
	
	private static class MyObjectHandler{
		private static MyObject4 mo = new MyObject4(); 
	}


	public static MyObject4 getInstance(){
		return MyObjectHandler.mo;
	}
}
