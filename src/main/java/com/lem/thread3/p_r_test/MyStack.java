package com.lem.thread3.p_r_test;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List list = new ArrayList();
	
	@SuppressWarnings("unchecked")
	synchronized public void push(){
		try {
			if(list.size() == 1){
				this.wait();
			}
			list.add("anyString= " + Math.random());
			this.notify();
		} catch (Exception e) {
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try{
			if(list.size() == 0){
				System.out.println("wait   pop  "+ Thread.currentThread().getName());
				this.wait();
			}
			returnValue = "" + list.get(0);
			System.out.println("wait  pop  "+ Thread.currentThread().getName() + "   " + list.size());
		}catch (Exception e) {
		}
		return returnValue;
	}
}
