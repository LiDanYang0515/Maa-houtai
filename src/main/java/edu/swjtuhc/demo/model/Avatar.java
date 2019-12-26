package edu.swjtuhc.demo.model;

public class Avatar {
	private int A_Id;
	private String avatar;
	public int getA_Id() {
		return A_Id;
	}
	public void setA_Id(int a_Id) {
		A_Id = a_Id;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	@Override
	public String toString() {
		return "Avatar [A_Id=" + A_Id + ", avatar=" + avatar + "]";
	}
	
	
}
