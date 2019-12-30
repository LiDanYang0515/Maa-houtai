package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Article;

@Mapper
public interface ArticleMapper {
	//插入数据
	public int insertArticle(Article article);
	//删除数据
	public int deleteArticle(Integer articleID);
	//查看数据
	
	public List<Article> findArticleByuserID();
	
}
