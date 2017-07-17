package com.lem.thread.sameNum;

public class Main {
	
	public static void main(String[] args) {
		
	}
	
	public static void demo1(){
		MyThread mt = new MyThread();
		new Thread(mt,"1").start();
		new Thread(mt,"2").start();
		new Thread(mt,"3").start();
		new Thread(mt,"4").start();
		new Thread(mt,"5").start();
		new Thread(mt,"6").start();
//		System.out.println("count= " + (count--) + "  threadName: " +Thread.currentThread().getName());
//		count= 5  threadName: 2
//		count= 4  threadName: 1
//		count= 5  threadName: 3
//		count= 3  threadName: 4
//		count= 2  threadName: 5
//		count= 1  threadName: 6
	}
	
}
