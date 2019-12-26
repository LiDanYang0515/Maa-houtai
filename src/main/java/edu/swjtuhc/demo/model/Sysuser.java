package edu.swjtuhc.demo.model;

import org.springframework.web.multipart.MultipartFile;

public class Sysuser {
	private int userId;
	private String username;
	private String password;
	private String name;
	private String gender;
	private int age;
	
	public int getUserId() {
		return userId;
	} 

	

	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Sysuser [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
}

