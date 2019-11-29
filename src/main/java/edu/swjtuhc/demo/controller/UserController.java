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
    @ResponseBody
    public JSONObject register(HttpServletRequest request,Sysuser user) {
    	//获取参数
//    	String username = request.getParameter("username");
//    	System.out.println(user.getUsername());
//    	System.out.println(user.getPassword());
//    	System.out.println(user.getName());
    	
//    	request.getSession();
//    	request.getRequestURI();
    	
    	//调用service处理逻辑
    	//int i = userService.register(user);
    	//响应/返回视图
    	//纯view
    	//model and view
    	//基于JSP
    	//返回JSON
//    	ModelAndView mav = new ModelAndView();
//    	mav.setViewName("success");
    	JSONObject result = new JSONObject();
    	result.put("code", 0);
    	result.put("data", null);
    	result.put("msg","注册失败！账号和密码不能为空！");
    	if (user.getUsername()==null||user.getPassword()==null) {
			return result;
		}
    	List<Sysuser> sysuer=userService.findByusername(user.getUsername());
    	if (sysuer.size()!=0){
            result.put("code",0);
            result.put("data",sysuer.size());
            result.put("msg","已有此用户名，请更换");
            return result;
        }
    	JSONObject i = userService.register(user);
    	if(i==null){
            return result;
        }else {
        result.put("code",1);
        result.put("data",result);
        result.put("message","注册成功");
        return result;
        }
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
