package com.lem.thread2.synchronized_method;

import java.util.Date;

public class PublicVar {
	private String name = "A";
	
	private String password = "AA";
	
	synchronized public void setValue(String name,String password){
		try {
			long beginTime = System.currentTimeMillis();
			System.out.println("setValue " + beginTime);
			Thread.sleep(50000);
			this.name = name;
			this.password = password;
			Date date = new Date();
			System.out.println("setValue name=  "+name+"    password=  "+password + "   Time"+date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	synchronized public void getValue(){
		long beginTime = System.currentTimeMillis();
		System.out.println("getValue "+beginTime);
		Date date = new Date();
		System.out.println("getValue  name=  "+name+"    password=  "+password + "   Time"+date.getTime());
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
