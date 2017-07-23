package com.lem.thread2.syn_blocks_object_monitor;

public class Service {
	
	private String usernameParam;
	private String passswordParam;
	private String anyString = new String();
	
	public void setUserNamePassword(String uname,String pw){
		synchronized(anyString){
			try {
				System.out.println("begin  " +Thread.currentThread().getName()+"   "+ System.currentTimeMillis() );
				usernameParam = uname;
				Thread.sleep(3000);
				passswordParam = pw;
				System.out.println("end  " +Thread.currentThread().getName() +"   "+ System.currentTimeMillis() );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void setUserNamePassword1(String uname,String pw){
		String anyString = new String();
		synchronized(anyString){
			try {
				System.out.println("begin  " +Thread.currentThread().getName()+"   "+ System.currentTimeMillis() );
				usernameParam = uname;
				Thread.sleep(3000);
				passswordParam = pw;
				System.out.println("end  " +Thread.currentThread().getName() +"   "+ System.currentTimeMillis() );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void sys(){
		System.out.println(Thread.currentThread().getName() +"   sys   "+ System.currentTimeMillis());
	}

	public String getUsernameParam() {
		return usernameParam;
	}

//	public void setUsernameParam(String usernameParam) {
//		this.usernameParam = usernameParam;
//	}

	public String getPassswordParam() {
		return passswordParam;
	}

//	public void setPassswordParam(String passswordParam) {
//		this.passswordParam = passswordParam;
//	}
	
	
	
	
	
}
