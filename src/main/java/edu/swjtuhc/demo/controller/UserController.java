package edu.swjtuhc.demo.controller;



import java.util.List;

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
    //注册
    @RequestMapping("register")
    public ModelAndView register(HttpServletRequest request,@RequestParam("password") String password,Sysuser user) {
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
    //登陆
    @RequestMapping("/login")
    	public ModelAndView login(HttpServletRequest request,@RequestParam("username")String username,@RequestParam("password") String password){
    	//获取参数	
    	List<Sysuser> sysuser = UserService.findByusernameAndpassword(username,password);
    	System.out.println(username);
    	System.out.println(password);
    	
    	request.getSession();
    	request.getRequestURI();
    	ModelAndView success = new ModelAndView();
    	
    	//调用srevice处理逻辑
    	if (sysuser.size()>0) {
			success.setViewName("恭喜！登陆成功");
		}else {
			success.setViewName("用户名或密码错误");
		}
    
    	//响应/返回视图
    	
    	return success;
    }
}
