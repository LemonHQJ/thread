package com.lem.thread3.join;

public class MockTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		Thread tt = new Thread(t1);
		tt.start() ;

		for (int k = 0; k < 5; k++) {
			t1.addA();
			System.out.println(" Main Thread Add a: " + t1.a);
		}
	}
}

class Test implements Runnable {
	public int a = 0;

	public void run() {
		synchronized (this) {
			while (a < 4) {
				System.out.println("a<4 " + Thread.currentThread().getName() + "--a..." + a);
				try {
//					Thread.sleep(1000);
					 this.wait(1000) ;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(" a>4...." + Thread.currentThread().getName());
	}

	public synchronized void addA() {
		a++;
	}
}