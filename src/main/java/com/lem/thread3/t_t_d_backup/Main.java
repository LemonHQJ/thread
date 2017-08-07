package com.lem.thread3.t_t_d_backup;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		demo1();
	}

	public static void demo1() {
		Object obj = new Object();
		DataA da = new DataA(obj);
		DataB db = new DataB(obj);
		ThreadA[] ta = new ThreadA[10];
		ThreadB[] tb = new ThreadB[10];
		for(int i=0;i<10;i++){
			ta[i] = new ThreadA(da);
			tb[i] = new ThreadB(db);
			ta[i].start();
			tb[i].start();
		}
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List lista = da.returnList();
		List listb = db.returnList();
		for(int i=0;i<lista.size();i++){
			System.out.println("a " + lista.get(i));
		}
		
		for(int i=0;i<listb.size();i++){
			System.out.println("b " + listb.get(i));
		}
	}

}
