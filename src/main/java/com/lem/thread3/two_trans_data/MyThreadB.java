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
		synchronized (list) {
			try {
//			while (true) {
				System.out.println("~~~~~~~~");
//				if (list.size() == 5) {
				if (list.size() != 5) {
					System.out.println("退出线程B");
					list.wait();
					throw new InterruptedException();
				}
//			}
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
				e.printStackTrace();
			}
		}

	}

}
