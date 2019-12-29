package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Login;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.LoginService;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/users")
public class LoginController {
	 @Autowired
	    LoginService loginService;
	//登录
		@RequestMapping("/login")
		public JSONObject login(@RequestBody Login user) {
			JSONObject result = new JSONObject();
			
			int i=loginService.login(user);
	    	result.put("state", i);
			return result;
		}
		
}
