package edu.swjtuhc.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import edu.swjtuhc.demo.model.Article;

public interface ArticleService {
	 	String TABLE_NAEM = " article ";
	    String INSERT_FIELDS = " AticleTitle,ArticleContent,created_Date,Sysuer_userID";
	    String SELECT_FIELDS = " ArticleID, " + INSERT_FIELDS;

	    @Insert({"insert into",TABLE_NAEM,"(",INSERT_FIELDS,") values (#{AticleTitle},#{ArticleContent}" +
	            ",#{created_Date})"})
	    int insertArticle(Article article);

	    @Select({"select",SELECT_FIELDS,"from",TABLE_NAEM,"where id=#{ArticleID}"})
	    Article selectById(int articleid);

	    @Select({"select",SELECT_FIELDS,"from",TABLE_NAEM,"order by ArticleId desc limit #{offset},#{limit}"})
	    List<Article> selectLatestArticles(@Param("offset") int offset, @Param("limit") int limit);

	    @Select({"select count(ArticleID) from",TABLE_NAEM})
	    int getArticleCount();

	    @Delete({"delete from",TABLE_NAEM,"where id=#{ArticleID}"})
	    void deleteById(int articleid);
	}

