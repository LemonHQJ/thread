package com.lem.thread2.synchronized_mth.syn_not_ext;

public class Main {

	public static void main(String[] args) {
		demo1();
	}
	
	/**
	 * 同步不可继承
	 */
	public static void demo1(){
		Sub sub = new Sub();
		MyThreadA mta = new MyThreadA(sub);
		mta.setName("A");
		MyThreadB mtb = new MyThreadB(sub);
		mtb.setName("B");
		mta.start();
		mtb.start();
		
//		
//		Sub 下一步 sleep begin threadName=  A   time=1500624697108
//		Sub 下一步 sleep begin threadName=  B   time=1500624703121
	}
}
