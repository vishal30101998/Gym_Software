package com.company.Dao;

public class User {
	
	String username;
	String email;
	String age;
	String address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, String age, String address) {
		super();
		this.username = username;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

	

	
	

}
