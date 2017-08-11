package com.lem.thread3.threadlocal;

public class Tools {

	public static ThreadLocal<String> t1 = new ThreadLocal<String>();
	
	public static void add(String str){
		t1.set(str);
	}

} 
