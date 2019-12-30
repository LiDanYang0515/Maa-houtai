package edu.swjtuhc.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import edu.swjtuhc.demo.model.Article;
public interface ArticleService {
	//插入数据
	public int write(Article article);
    //删除数据	
	public int delWrite(int articleID);
	//查找数据
	public List<Article> getWrite();

}

