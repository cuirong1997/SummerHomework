package summer.domain;

import java.io.Serializable;

public class News implements Serializable{
	
	public int news_id;
	public String news_name;
	public String news_href;
	public String news_time;
	
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getNews_name() {
		return news_name;
	}
	public void setNews_name(String news_name) {
		this.news_name = news_name;
	}
	public String getNews_href() {
		return news_href;
	}
	public void setNews_href(String news_href) {
		this.news_href = news_href;
	}
	public String getNews_time() {
		return news_time;
	}
	public void setNews_time(String news_time) {
		this.news_time = news_time;
	}
	
	@Override
	public String toString() {
		return "News[news_id="+news_id+",news_name="+news_name+",news_href="+news_href+",news_time="+news_time+"]";
	}
	
	

}
