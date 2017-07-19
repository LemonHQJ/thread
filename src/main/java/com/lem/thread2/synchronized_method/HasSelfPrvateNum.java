package com.lem.thread2.synchronized_method;

public class HasSelfPrvateNum {

	public void addI(String username){
		try {
			int num = 0;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
