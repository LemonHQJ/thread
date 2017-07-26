package com.lem.thread3.two_trans_data;

import com.lem.thread3.MyList;

public class MyThread extends Thread {

	private MyList list;

	public MyThread(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("run----------" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
