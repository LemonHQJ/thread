package com.lem.thread2.synchronized_method;

public class HasSelfPrvateNum2 {
	
	private int num = 0;
	
	synchronized public void addI(String username){
		try {
			if("a".equals(username)){
				num = 100;
				System.out.println("a set over");
				Thread.sleep(1000);
			}else {
				num = 2000;
				System.out.println("b set over");
				Thread.sleep(1000);
			}
			System.out.println("username= " + username + "  num: "+ num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
