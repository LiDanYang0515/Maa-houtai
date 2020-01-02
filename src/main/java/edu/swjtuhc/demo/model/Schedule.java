package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Schedule {
	private int S_id;
	private Date date;
	private String text;
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Schedule [S_id=" + S_id + ", date=" + date + ", text=" + text + "]";
	}

}
