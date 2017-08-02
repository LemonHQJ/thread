package com.lem.thread3.p_r_test;

public class Main {

	public static void main(String[] args) {
		demo1();
	}
	
	public static void demo1(){
		String str = new String("");
		C c = new C(str);
		P p = new P(str);
		ThreadP tp = new ThreadP(p);
		ThreadR ct = new ThreadR(c);
		tp.setName("pt ");
		ct.setName("ct ");
		tp.start();
		ct.start();
	}

}
