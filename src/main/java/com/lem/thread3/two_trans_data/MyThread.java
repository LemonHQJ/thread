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
			synchronized (list) {
				for (int i = 0; i < 10; i++) {
					list.add();
					System.out.println("run----------" + i);
					if(list.size() == 5){
						System.out.println("唤醒");
						list.notify();
					}
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
