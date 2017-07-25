package com.lem.thread2.syn_blocks_static_inner;

import com.lem.thread2.syn_blocks_static_inner.OutClass.Inner;
import com.lem.thread2.syn_blocks_static_inner.OutClass.Inner2;
import com.lem.thread2.syn_blocks_static_inner.PublicClass.PrivateClass;

public class Main {

	
	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo3();
		demo4();
	}
	
	
	/**
	 * 内部类
	 */
	public static void demo1(){
		PublicClass pc = new PublicClass();
		pc.setUsername("pcUsername");
		pc.setPassword("pcPassword");
		System.out.println("pc: username= "+pc.getUsername() + "password= "+pc.getPassword());
		PrivateClass prc = pc.new PrivateClass();
		prc.setAddress("prcAddress");
		prc.setAge("prcAge");
		System.out.println("prc: address= "+prc.getAddress() + "password= "+prc.getAge());
	}
	
	public static void demo2(){
//		PublicClass_ pc = new PublicClass_();
//		pc.setUsername("pcUsername");
//		pc.setPassword("pcPassword");
//		System.out.println("pc: username= "+pc.getUsername() + "password= "+pc.getPassword());
//		PrivateClass prc = new PrivateClass();
//		prc.setAddress("prcAddress");
//		prc.setAge("prcAge");
//		System.out.println("prc: address= "+prc.getAddress() + "password= "+prc.getAge());
	}
	
	/**
	 * 内置类与同步1
	 * 异步：不同锁对象
	 */
	public static void demo3(){
		final Inner in = new Inner();
		Thread t1 = new Thread(){
			public void run(){
				in.method1();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				in.method2();
			}
		};
		t1.start();
		t2.start();
	}
	
	
	/**
	 * 内置类与同步2
	 * 相同锁对象同步
	 * 不同异步
	 */
	public static void demo4(){
		final Inner in = new Inner();
		final Inner2 in1 = new Inner2();
		Thread t1 = new Thread(){
			public void run(){
				in.method(in1);
			}
		};
		t1.setName("t1");
		Thread t2 = new Thread(){
			public void run(){
				in.method2();
			}
		};
		t2.setName("t2");
		Thread t3 = new Thread(){
			public void run(){
				in1.method();
			}
		};
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
