package com.lem.thread2.syn_blocks_object_summary2_2_8;

public class MyObject {

	
	synchronized public void print(){
		System.out.println(Thread.currentThread().getName() + "    print");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(Thread.currentThread().getName() + "    print");
	}
}
