package com.lem.thread3.t_t_d_backup;

import java.util.ArrayList;
import java.util.List;

public class DataB {

	private Object obj;
	private List list = new ArrayList<String>();
	
	public DataB(Object obj){
		this.obj = obj;
	}
		
	@SuppressWarnings("unchecked")
	public void insert(String str){
		synchronized (obj) {
			try {
				while(obj.flag){
					list.add(str);
					System.out.println("DataB : "+str);
//					obj.modify();
					obj.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			obj.modify();
			obj.notifyAll();
		}
		
	}
	
	public List returnList(){
		return list;
	} 
}
