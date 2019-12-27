package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface ArticleMapper {
	//插入数据
	public int insertArticle(Article article);
	//删除数据
	public int deleteArticle(Article articleID);
}
