package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	ArticleService articleService;
	//写记事
	@RequestMapping("/write")
	public JSONObject write(@RequestBody Article article) {
		JSONObject result = new JSONObject();
		int i=articleService.write(article);
		result.put("state", i);
		return result;				
	}
	@RequestMapping("/delWrite")
	public JSONObject delWrite(@RequestBody Integer articleID) {
		JSONObject result = new JSONObject();
		int i=articleService.delWrite(articleID);
		result.put("state", i);
		return result;
	}
	@RequestMapping("/getWrite")
	public JSONObject getWrite(@RequestBody Article article) {
		JSONObject result = new JSONObject();
		List<Article> resulet = articleService.getWrite(article);
		return result;
	}
	
}
