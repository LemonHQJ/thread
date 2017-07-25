package com.lem.thread2.syn_blocks_static;

public class MyObject {
	synchronized public void method() {
		System.out.println(Thread.currentThread().getName() + " begin  MyObject ");

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " i= " + i + "  MyObject ");
		}
		System.out.println(Thread.currentThread().getName() + " end  MyObject ");
	}
	
}
