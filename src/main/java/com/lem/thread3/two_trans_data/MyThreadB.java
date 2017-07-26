package com.lem.thread3.two_trans_data;

import com.lem.thread3.MyList;

public class MyThreadB extends Thread {

	private MyList list;

	public MyThreadB(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		try {
			while (true) {
				String a = new String();
				synchronized (a) {

				}
				if (list.size() == 5) {
					System.out.println("退出线程B");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
			e.printStackTrace();
		}

	}

}
