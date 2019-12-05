package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Article {
	private int articleID;
	private String articleTitle;
	private String artticleContent;
	private Date create_Date;
	private int Sysuer_userID;
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArtticleContent() {
		return artticleContent;
	}
	public void setArtticleContent(String artticleContent) {
		this.artticleContent = artticleContent;
	}
	public Date getCreate_Date() {
		return create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}
	public int getSysuer_userID() {
		return Sysuer_userID;
	}
	public void setSysuer_userID(int sysuer_userID) {
		Sysuer_userID = sysuer_userID;
	}
	
}
			