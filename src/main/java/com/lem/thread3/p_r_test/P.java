package com.lem.thread3.p_r_test;


public class P {
	
	private String lock;
	
	public P(String lock){
		super();
		this.lock = lock;
	}
	
	public void setValue(){
		synchronized (lock) {
			try {
				if(!"".equals(ValueObject.value)){
					lock.wait();
				}
				String value = System.currentTimeMillis() +"  _  ";
				ValueObject.value = value;
				lock.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
