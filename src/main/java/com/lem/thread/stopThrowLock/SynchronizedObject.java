package com.lem.thread.stopThrowLock;

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
	
	synchronized public void print(String name,String ps){
		try {
			this.username = name;
			Thread.sleep(100000);
			this.password = ps;
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
