package edu.swjtuhc.demo.model;

import java.sql.Date;

public class Article {
	private String articleContent;
	private int userID;
	private int articleID;
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	@Override
	public String toString() {
		return "Article [articleContent=" + articleContent + ", userID=" + userID + ", articleID=" + articleID + "]";
	}
	
}
			