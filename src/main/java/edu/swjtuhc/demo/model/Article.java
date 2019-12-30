package edu.swjtuhc.demo.model;

public class Article {
	private String articleConcent;
	private int articleID;
	private int username;
	public String getArticleConcent() {
		return articleConcent;
	}
	public void setArticleConcent(String articleConcent) {
		this.articleConcent = articleConcent;
	}
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Article [articleConcent=" + articleConcent + ", articleID=" + articleID + ", username=" + username
				+ "]";
	}
	
}
