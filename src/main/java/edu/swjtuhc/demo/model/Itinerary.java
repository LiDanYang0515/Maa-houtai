package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Itinerary {
	private int T_ID;
	private Date date;
	private String text;
	
	public int getT_ID() {
		return T_ID;
	}
	public void setT_ID(int t_ID) {
		T_ID = t_ID;
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
		return "Itinerary [T_ID=" + T_ID + ", date=" + date + ", text=" + text + "]";
	}
	
}
