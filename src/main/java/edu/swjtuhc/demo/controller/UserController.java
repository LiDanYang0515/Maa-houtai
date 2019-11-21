package edu.swjtuhc.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping("register")
    public ModelAndView rigister(HttpServletRequest request,@RequestParam("password") String password,Sysuser user) {
    	//获取参数
    	String username = request.getParameter("username");
    	System.out.println(username);
    	System.out.println(password);
    	System.out.println(user.getName());
    	
    	request.getSession();
    	request.getRequestURI();
    	
    	//调用service处理逻辑
    	int i = userService.register(user);
    	//响应/返回视图
    	//纯view
    	//model and view
    	//基于JSP
    	//返回JSON
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("success");
    	if(i==0) {
    		mav.addObject("msg","注册失败");
    	}else if (i>0) {
    		mav.addObject("msg","恭喜，注册成功");
    		mav.addObject("user",user);	
		}
    	return mav;
    }
    @RequestMapping("/login")
    public String login() {
    	//获取参数
    	//调用srevice处理逻辑
    	//响应/返回视图
    	
    	return null;
    }
    
}
