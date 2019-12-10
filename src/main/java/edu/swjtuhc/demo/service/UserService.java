package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Sysuser;
import net.sf.json.JSONObject;

public interface UserService {
	//注册
	public int register(Sysuser user);
	//登陆
	public int login(Sysuser user);
//	public  Sysuser findByusernameAndpassword(String username, String password);
	
//	public JSONObject register(Sysuser user);
	//根据名字查找数据库
//	public List<Sysuser> findByusername(String username);
}
