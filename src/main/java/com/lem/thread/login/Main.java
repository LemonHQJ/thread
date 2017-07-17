package com.lem.thread.login;

public class Main {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		BLogin b = new BLogin();
		try {
			new Thread(b).start();
			new Thread(a).start();
			new Thread(a).start();
			Thread.sleep(1000);
			new Thread(b).start();
			new Thread(a).start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
