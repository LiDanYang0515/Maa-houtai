package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ArticleMapper;
import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;
	//添加
	@Override
	public int write(Article article) {
		int i = -1;
		if (article==null) {
			i = 2; 
		}else {
			i = articleMapper.insertArticle(article);
		}
		return i;
		
	}
}
