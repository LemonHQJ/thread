package com.lem.thread3.threadlocal;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Object> {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	
}
