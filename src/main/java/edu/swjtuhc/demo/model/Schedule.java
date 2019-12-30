package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Schedule {
	private int S_id;
	private Date create_Date;
	private String textString;
	
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public Date getCreate_Date() {
		return create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}
	public String getTextString() {
		return textString;
	}
	public void setTextString(String textString) {
		this.textString = textString;
	}
	@Override
	public String toString() {
		return "Schedule [S_id=" + S_id + ", create_Date=" + create_Date + ", textString=" + textString + "]";
	}
	
	
}
