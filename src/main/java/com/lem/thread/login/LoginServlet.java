package com.lem.thread.login;

public class LoginServlet {

	private static String usernameRef;
	private static String passwordRef;
	
	public static void doPost(String username, String password){
//		try {
			usernameRef = username;
//			if("a".equals(username)){
//				Thread.sleep(1000);
//			}
			passwordRef = password;
			System.out.println("username= "+ username + "  password= "+ password);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
