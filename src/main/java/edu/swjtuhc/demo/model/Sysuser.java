package edu.swjtuhc.demo.model;

public class Sysuser {
	private int userId;
	private String username;
	private String email;
	private String password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Sysuser [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}

