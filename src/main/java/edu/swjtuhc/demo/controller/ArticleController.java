package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Article;
import edu.swjtuhc.demo.service.ArticleService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/write")
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
	
}
