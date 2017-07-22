package com.lem.thread2.syn_method_reentrantlock;

public class SS extends FF {
	
	synchronized public void operateISubMethod(){
		try{
			while(i>0){
				i--;
				System.out.println("sub print i= " + i);
				Thread.sleep(1000);
				this.operateIMainMethod();
			}
		} catch(InterruptedException e) {
		}
	}
}
