package com.lem.thread2.syn_blocks_static_inner;

public class OutClass {
	static class Inner{
		public void method1(){
			String str = "11";
			synchronized(str){
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "		m1");
				}
				
			}
		}
		synchronized public void method2(){
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " begin Inner1  m2    " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " 离开  Inner1 m2");
		}
		
		public void method(Inner2 inner2){
			synchronized (inner2) {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "	 inner	m" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " 离开  Inner1 m");
			}
			
		}
	}
	
	static class Inner2{
		synchronized public void method(){
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + i+" begin Inner2	m");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " 离开  Inner2 m");
		}
	}

}
