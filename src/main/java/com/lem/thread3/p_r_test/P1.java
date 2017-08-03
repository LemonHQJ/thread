package com.lem.thread3.p_r_test;

public class P1 {

	private MyStack myStack;
	
	public P1(MyStack myStack){
		this.myStack = myStack;
	}

	public void pushService(){
		myStack.push();
	}
}
