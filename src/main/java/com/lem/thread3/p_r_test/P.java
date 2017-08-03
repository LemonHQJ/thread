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

	public void setValue1(){
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")){
					System.out.println("生产者	" + Thread.currentThread().getName()+ "  waiting  ");
					lock.wait();
				}
				String value = System.currentTimeMillis() +"  _  ";
				ValueObject.value = value;
				lock.notify();
				System.out.println("生产者	" + Thread.currentThread().getName()+ "  notify  ");
			}
	   }catch (InterruptedException e) {
			e.printStackTrace();
	   }
	}
}
