package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Schedule {
	private Date create_Date;
	private String textString;
	
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
		return "Schedule [create_Date=" + create_Date + ", textString=" + textString + "]";
	}
	
	
}
