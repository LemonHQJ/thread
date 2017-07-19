package com.lem.thread2.synchronized_method;

public class PublicVar {
	private String name = "A";
	private String password = "AA";
	
	synchronized public void setValue(String name,String password){
		try {
			this.name = name;
			Thread.sleep(1000);
			this.password = password;
			System.out.println("name=  "+name+"    password=  "+password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
