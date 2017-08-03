package com.lem.thread3.p_r_test;

public class Main {

	public static void main(String[] args) {
//		demo1();
		demo2();
	}
	
	
	/**
	 * 单生产/单消费
	 * 正常运行
	 */
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

	/**
	 * 多生产/多消费
	 * 假死：可能原因是连续唤醒同类；解决：notifyAll不仅唤醒同类，也唤醒异类
	 */
	public static void demo2(){
		String str = new String("");
		C c = new C(str);
		P p = new P(str);
		ThreadP[] tp = new ThreadP[2];
		ThreadR[] ct = new ThreadR[2];
		for (int i = 0; i < 2; i++) {
			tp[i] = new ThreadP(p);
			ct[i] = new ThreadR(c);
			tp[i].setName("生产者     " +(i+1) );
			ct[i].setName("消费者     " +(i+1) );
			tp[i].start();
			ct[i].start();
		}
	}
}
