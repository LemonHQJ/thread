package com.lem.thread2.syn_blocks_static_inner;

public class PublicClass_ {

	static private String username;
	static private String password;

	static class PrivateClass {
		private String age;
		private String address;

		public String getAge() {
			return age;
		}
		
		public void setAge(String age){
			this.age = age;
		}
		
		public void setAddress(String address){
			this.address = address;
		}
		
		public String getAddress(){
			return address;
		}
		
		public void printPublicProperty(){
			System.out.println(username + " " + password);
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}