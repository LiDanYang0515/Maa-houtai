package edu.swjtuhc.demo.model;

public class Article {
	private String articleContent;
	private int articleID;
	
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public int getArticleID() {
		return articleID;
	}
	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}
	@Override
	public String toString() {
		return "Article [articleContent=" + articleContent + ", articleID=" + articleID + "]";
	}
	
}
