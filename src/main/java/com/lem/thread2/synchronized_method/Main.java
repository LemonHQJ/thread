package com.lem.thread2.synchronized_method;

public class Main {

	
//	关键字synchronized取得的锁都是对象锁，并不是把一段代码当做锁，在多线程一个对象中，谁先执行synchronized方法，谁就持有所属对象锁，那么其余线程呈现等待状态
	public static void main(String[] args) {
//		demo2();
//		demo3();
//		demo4();
//		demo5();
//		demo6();
//		demo7();
//		demo8();
		demo9();
	}
	
	
	/**
	 * 目的：测试私有变量是否安全
	 * 结果：安全；(猜：同一个方法，不同私有变量)
	 */
	public static void demo1(){
		HasSelfPrvateNum hs = new HasSelfPrvateNum();
		MyThread mt = new MyThread(hs,"a");
		MyThread mt1 = new MyThread(hs,"b");
		mt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt1.start();
		mt.stop();
	}
	
	/**
	 * 目的：测试实例变量是否安全
	 * 结果：线程不安全
	 */
	public static void demo2(){
		HasSelfPrvateNum1 hs = new HasSelfPrvateNum1();
		MyThread mt = new MyThread(hs);
		MyThread1 mt1 = new MyThread1(hs);
		MyThread1 mt2 = new MyThread1(hs);
		MyThread mt3 = new MyThread(hs);
		mt.start();
		mt1.start();
		mt2.start();
		mt3.start();
//		b set over
//		b set over
//		a set over
//		a set over
//		username= b  num: 100
//		username= b  num: 100
//		username= a  num: 100
//		username= a  num: 100

	}

	/**
	 * 目的：测试synchronized是否是线程安全 
	 * 
	 */
	public static void demo3(){
		HasSelfPrvateNum2 hs = new HasSelfPrvateNum2();
		MyThread mt = new MyThread(hs);
		MyThread1 mt1 = new MyThread1(hs);
		MyThread1 mt2 = new MyThread1(hs);
		MyThread mt3 = new MyThread(hs);
		mt.start();
		mt1.start();
		mt2.start();
		mt3.start();
	}
	
	/**
	 * 目的：多个对象多个锁
	 */
	public static void demo4(){
		HasSelfPrvateNum2 hsp = new HasSelfPrvateNum2();
		HasSelfPrvateNum2 hsp1 = new HasSelfPrvateNum2();
		MyThread mt = new MyThread(hsp);
		MyThread1 mt1 = new MyThread1(hsp1);
		mt.start();
		mt1.start();
	}
	
	/**
	 * 目的：在不同线程一个对象中同步锁与非同锁打印区别
	 * 结果：非同步锁(类似异步执行)
	 */
	public static void demo5(){
		MyObject mo = new MyObject();
		MyThread4 mt = new MyThread4(mo);
		MyThread4 mt1 = new MyThread4(mo);
		mt1.setName("a");
		mt.setName("b");
		mt.start();
		mt1.start();
		
//		结果
//		begin method Thread.name a
//		begin method Thread.name b
//		end method 
//		end method 


	}
	
	
	/**
	 * 目的：在不同线程一个对象中同步锁与非同锁打印区别
	 * 结果：同步锁(类似同步执行)
	 * 用同步锁声明的方法一定是排队执行
	 * 只有共享资源的读写访问才需要同步化
	 */
	public static void demo6(){
		MyObject mo = new MyObject();
		MyThread4 mt = new MyThread4(mo);
		MyThread4 mt1 = new MyThread4(mo);
		mt1.setName("a");
		mt.setName("b");
		mt.start();
		mt1.start();
		
//		结果
//		begin method Thread.name b
//		end method 
//		begin method Thread.name a
//		end method 
	}
	
	/**
	 * 目的：线程a调用同步，线程b调用其非同步
	 * 结果：a持有对象锁，b以异步的方式调用非同步方法
	 */
	public static void demo7(){
		MyObject mo = new MyObject();
		MyThread5 mt = new MyThread5(mo);
		MyThread5 mt1 = new MyThread5(mo);
		mt1.setName("a");
		mt.setName("b");
		mt.start();
		mt1.start();
		
//		结果
//		begin methodB Thread.name b
//		begin methodB Thread.name a
//		end method 
//		end method 

	}
	
	/**
	 * 目的：线程a,b调用同步，
	 * 结果：排队方式
	 */
	public static void demo8(){
		MyObject mo = new MyObject();
		MyThread5 mt = new MyThread5(mo);
		MyThread5 mt1 = new MyThread5(mo);
		mt1.setName("a");
		mt.setName("b");
		mt.start();
		mt1.start();
		
//		结果
//		begin methodB Thread.name a
//		end method 
//		begin methodB Thread.name b
//		end method 

	}
	
	/**
	 * 目的：测试脏数据
	 * 
	 */
	public static void demo9(){
		try {
			PublicVar pv = new PublicVar();
			MyThread7 mt = new MyThread7(pv);
			MyThread6 mt1 = new MyThread6(pv);
			mt1.start();
			mt.start();
			Thread.sleep(10);
			System.out.println(pv.getPassword()+"~~~~~~~~~~~"+pv.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		结果
//		mt1.start()
//		AA~~~~~~~~~~~B
//		name=  B    password=  BB
//		||(或者)
//		mt.start()
//		AA~~~~~~~~~~~B
//		name=  B    password=  BB
		
		
//		后期
//		测试两个线程调用同一个对象的两个不同的同步锁方法：排队执行：这时候getValue将不会出现脏数据
//		mt1.start()与mt.start()同时调用
//		setValue 1500459110844
//		AA~~~~~~~~~~~A
//		setValue name=  B    password=  BB   Time1500459160854
//		getValue 1500459160856
//		getValue  name=  B    password=  BB   Time1500459160856
	}
}
