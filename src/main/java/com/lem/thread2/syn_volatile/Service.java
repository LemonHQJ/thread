package com.lem.thread2.syn_volatile;

public class Service {

	private boolean isContinueRun = true;

	public void run() {
		System.out.println("methodA begin");
		while (isContinueRun) {
			// System.out.println("while"); 这里打印有同步的作用，syso里有syn代码块；
		}
		System.out.println("methodA end");
	}

//	public void run() {
//		System.out.println("methodA begin");
//		while (isContinueRun) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//			}
//		}
//		System.out.println("methodA end");
//	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
