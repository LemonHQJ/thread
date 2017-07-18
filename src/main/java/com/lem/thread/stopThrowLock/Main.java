package com.lem.thread.stopThrowLock;

public class Main {
	public static void main(String[] args) {
		
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(5000);
			thread.stop();
			System.out.println(object.getUsername()+"	"+ object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
