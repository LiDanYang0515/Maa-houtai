package edu.swjtuhc.demo.model;

public class Nnames {
	  private int id;
	    private String content;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		@Override
		public String toString() {
			return "Sign [id=" + id + ", content=" + content + "]";
		}
	    
}
