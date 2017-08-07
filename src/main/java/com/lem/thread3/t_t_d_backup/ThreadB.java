package com.lem.thread3.t_t_d_backup;

public class ThreadB extends Thread {

	private DataB db;
	static int i = 1;
	
	public ThreadB (DataB db){
		this.db = db;
	}
	
	@Override
	public void run() {
		super.run();
		db.insert(i+"");
		i++;
	}
}
