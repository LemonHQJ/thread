package com.lem.thread3.two_trans_data;

public class MyThreadB extends Thread {

	private MyList list;
	
	public MyThreadB(MyList list){
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			while(true){
				if(list.size()==5){
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	
}
