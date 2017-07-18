package com.lem.thread.suspend_resume;

public class SynchronizedObject {

	private String username = "a";
	private String password = "aa";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	synchronized public void printString(){
		System.out.println("begin");
		if("a".equals(Thread.currentThread().getName())){
			System.out.println("a 线程永远 suspend了！ ");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
	
}
