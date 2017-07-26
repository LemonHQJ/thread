package com.lem.thread3.two_trans_data;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList<String>();
	
	public void add(){
		list.add("str");
	}
	
	public int size(){
		return list.size();
	}
}
