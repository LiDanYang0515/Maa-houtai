package edu.swjtuhc.demo.model;

public class Login {
 private String username;
 private int password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
@Override
public String toString() {
	return "Login [username=" + username + ", password=" + password + "]";
}
 
}
