package com.lem.thread3.p_r_test;

public class C1 {

	private MyStack myStack;
	
	public C1(MyStack myStack){
		this.myStack = myStack;
	}

	public void popService(){
		System.out.println("pop size    = " +myStack.pop());
	}
}
