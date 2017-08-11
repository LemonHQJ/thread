package com.lem.thread4.reetrantlock;

public class Main {

	public static void main(String[] args) {
		demo1();
	}

	public static void demo1(){
		MyService ms = new MyService();
		ThreadA ta1 = new ThreadA(ms);
		ThreadA ta2 = new ThreadA(ms);
		ThreadA ta3 = new ThreadA(ms);
		ta1.setName("A");
		ta2.setName("B");
		ta3.setName("C");
		ta1.start();
		ta2.start();
		ta3.start();
	}
}
