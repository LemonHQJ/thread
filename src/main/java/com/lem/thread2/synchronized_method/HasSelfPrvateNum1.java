package com.lem.thread2.synchronized_method;

public class HasSelfPrvateNum1 {
	
	private int num = 0;
	
	public void addI(String username){
		try {
			if("a".equals(username)){
				num = 100;
				Thread.sleep(1000);
				System.out.println("a set over");
			}else {
				num = 2000;
				System.out.println("b set over");
			}
			System.out.println("username= " + username + "  num: "+ num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
