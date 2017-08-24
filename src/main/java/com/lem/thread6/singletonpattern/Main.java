package com.lem.thread6.singletonpattern;

public class Main {

	public static void main(String[] args) {
//		demo3();
//		demo4();
		demo5();
	}
	
//	饥饿模式
	public static void demo1(){
		Thread t1 = new Thread(){
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		};
		
		Thread t3 = new Thread(){
			public void run() {
				System.out.println(MyObject.getInstance().hashCode());
			}
		};
		t1.start();
		t3.start();
		t2.start();
	}
	
//	懒汉模式
	public static void demo2(){
		Thread t1= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject2.getInstance().hashCode());
			}
		};
	}
	
	
	/**
	 * 懒汉模式
	 * 不能保持单例模式
	 */
	public static void demo3(){
		Thread t1= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		Thread t2= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		Thread t3= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		t1.start();
		t3.start();
		t2.start();
//		非单例
//		957509009
//		1758947292
//		367252042
		
//		synchronized :设置同步方法效率太低
		}
	
	/**
	 * dcl双检查锁机制
	 * synchronized,volatile
	 * 
	 */
	public static void demo4(){
		Thread t1= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		Thread t2= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		Thread t3= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject1.getInstance().hashCode());
			}
		};
		t1.start();
		t3.start();
		t2.start();
//		278058706
//		278058706
//		278058706
	}

	/**
	 * 静态内置类实现单例????????????????
	 */
	public static void demo5() {
		Thread t1= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject4.getInstance().hashCode());
			}
		};
		
		Thread t2= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject4.getInstance().hashCode());
			}
		};
		Thread t3= new Thread(){
			@Override
			public void run() {
				System.out.println(MyObject4.getInstance().hashCode());
			}
		};
		t1.start();
		t3.start();
		t2.start();
	}
	
	/**
	 * 序列号与反序列化
	 */
	public static void demo6() {
		
	}
}
