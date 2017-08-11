package com.lem.thread3.threadlocal;

public class Tools {

	public static ThreadLocal<String> t1 = new ThreadLocal<String>();
	
	public static InheritableThreadLocalExt te1 = new InheritableThreadLocalExt();
	
	public static void add(String str){
		t1.set(str);
	}

} 
