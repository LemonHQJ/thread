package com.lem.thread3.two_trans_data;

import com.lem.thread3.MyList;

public class Main {
	public static void main(String[] args) {
		demo1();
	}

	public static void demo1() {
		MyList list = new MyList();
		MyThread mta = new MyThread(list);
		MyThreadB mtb = new MyThreadB(list);
		mta.start();
		mtb.start();
	}

}
