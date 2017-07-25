package com.lem.thread2.syn_blocks_static;

public class Service {

	synchronized public static void printA(){
		System.out.println(Thread.currentThread().getName()  + "  printA  begin"+System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()  + "  printA   end"+System.currentTimeMillis());
	}
	
//	同上
//	public static void printA(){
//		synchronized (Service.class) {
//			System.out.println(Thread.currentThread().getName()  + "  printA  begin"+System.currentTimeMillis());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()  + "  printA   end"+System.currentTimeMillis());
//		}
//	}
	
	
	
	synchronized public static void printB(){
		System.out.println(Thread.currentThread().getName()  + "  printB  begin"+System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()  + "  printB   end"+System.currentTimeMillis());
	}
	
	synchronized public void printC(){
		System.out.println(Thread.currentThread().getName()  + "  printC  begin"+System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()  + "  printC   end"+System.currentTimeMillis());
	}
	
	
	
	public void method(MyObject mo){
		
		synchronized(mo){
			System.out.println(Thread.currentThread().getName() + " begin  sevice me" );

			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName() + " i= " + i + "  sevice me" );
			}
			System.out.println(Thread.currentThread().getName() + " end  sevice me" );

		}
	}
	
}
