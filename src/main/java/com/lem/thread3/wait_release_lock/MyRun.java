package com.lem.thread3.wait_release_lock;

public class MyRun {
	
	private String lock = new String("");
	public Runnable runa = new Runnable(){
		public void run() {
			try {
				System.out.println("    begin wait");
				lock.wait();
				System.out.println("    end wait");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	};

	public Runnable runb = new Runnable(){
		public void run() {
			System.out.println("    begin notify");
			lock.notify();
			System.out.println("    end notify");
		}
	};
	
	public static void main(String[] args) {
		MyRun run = new MyRun();
		Thread b = new Thread(run.runb);
		b.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread a = new Thread(run.runa);
		a.start();
	}
}
