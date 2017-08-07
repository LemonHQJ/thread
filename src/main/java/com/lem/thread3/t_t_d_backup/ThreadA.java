package com.lem.thread3.t_t_d_backup;

public class ThreadA extends Thread {

	private DataA db;
	static int i = 1;
	
	public ThreadA (DataA db){
		this.db = db;
	}
	
	@Override
	public void run() {
		super.run();
		db.insert(i+"");
		i++;
	}
}
