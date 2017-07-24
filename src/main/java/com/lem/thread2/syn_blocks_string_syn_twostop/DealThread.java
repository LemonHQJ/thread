package com.lem.thread2.syn_blocks_string_syn_twostop;

public class DealThread implements Runnable {
	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();
	public void setFlag(String username){
		this.username = username;
	}
	public void run() {
		if("a".equals(username)){
			synchronized (lock1) {
				try {
					System.out.println("username=  " + username);
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				synchronized (lock2) {
					System.out.println("lock1-----> lock2");
				}
			}
		}
		if("b".equals(username)){
			synchronized (lock2) {
				try {
					System.out.println("username=  " + username);
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				synchronized (lock1) {
					System.out.println("lock2-----> lock1");
				}
			}
		}
	}

}
