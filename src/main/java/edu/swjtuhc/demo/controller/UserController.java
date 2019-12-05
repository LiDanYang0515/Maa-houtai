package edu.swjtuhc.demo.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    //注册
    @RequestMapping("/register")
    public JSONObject register(@RequestBody Sysuser user) {
    	
    	JSONObject result = new JSONObject();
    	//调用service层
    	int i=userService.register(user);
    	result.put("msg", 1);
		return result;
    }
    //登陆
    @RequestMapping("/login")
    @ResponseBody
    	public JSONObject login(HttpServletRequest request,@RequestParam("username")String username,@RequestParam("password") String password){
    	//获取参数	
    	List<Sysuser> sysuser = userService.findByusernameAndpassword(username,password);
//    	System.out.println(username);
//    	System.out.println(password);
    	
//    	request.getSession();
//    	request.getRequestURI();
    	JSONObject success = new JSONObject();
    	if (username==null||password==null) {
			return success;
		}
    	//调用srevice处理逻辑
    	if (sysuser.size()>0) {
			success.put("code", 0);
			success.put("data", null);
			success.put("msg", "没有此用户");
			return success;//失败
		}else {
			success.put("code",1);
	        success.put("data",sysuser);
	        success.put("message","登陆成功");
	        return success; //成功
		}
    
    	//响应/返回视图
   
    }
}
