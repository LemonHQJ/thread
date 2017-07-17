package com.lem.thread.login;

public class BLogin extends Thread {
	@Override
	public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}
}
