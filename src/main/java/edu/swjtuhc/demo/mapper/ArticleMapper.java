package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface ArticleMapper {
	//插入数据
	public int insertArticle(Article article);
}
