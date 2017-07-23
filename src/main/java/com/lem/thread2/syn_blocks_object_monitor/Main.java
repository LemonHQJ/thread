package com.lem.thread2.syn_blocks_object_monitor;

public class Main {

	
	public static void main(String[] args) {
//		demo1();
//		demo2();
		demo2_();
	}

	/**
	 * 任意对象作为对象监视器
	 * 实例作为对象监视器
	 * 同步
	 */
	public static void demo1(){
		Service ser = new Service();
		MyThread mt = new MyThread(ser);	
		MyThread1 mt1 = new MyThread1(ser);	
		mt.setName("a");
		mt1.setName("b");
		mt.start();
		mt1.start();
//		begin  a1500712249728
//		end  a1500712252728
//		begin  b1500712252728
//		end  b1500712255729

	}
	
	/**
	 * 任意对象作为对象监视器
	 * 变量作为对象监视器(同一个方法)
	 * 异步
	 */
	public static void demo2(){
		Service ser = new Service();
		MyThread mt = new MyThread(ser);	
		MyThread1 mt1 = new MyThread1(ser);	
		mt.setName("a");
		mt1.setName("b");
		mt.start();
		mt1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ser.getPassswordParam());;
		
//		begin  a   1500712748115
//		begin  b   1500712748115
//		end  a   1500712751116
//		end  b   1500712751116
	}
	
	/**
	 * 变量/this 作为对象监视器(不同方法)
	 */
	public static void demo2_(){
		Service ser = new Service();
		MyThread mt = new MyThread(ser);	
		MyThread1 mt1 = new MyThread1(ser);	
		mt.setName("a");
		mt1.setName("b");
		mt.start();
		mt1.start();
		
//		运行结果
//		begin  b   1500713250298
//		a   sys   1500713250298
//		end  b   1500713253299
	}
}
