package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Sysuser;
import net.sf.json.JSONObject;

public interface UserService {
	
	//注册
	public int register(Sysuser user);
	//登陆
<<<<<<< HEAD
	public  Sysuser findByusernameAndpassword(String username, String password);
=======
	public int login(Sysuser user);
	
//	public  Sysuser findByusernameAndpassword(String username, String password);
>>>>>>> branch 'master' of https://github.com/LiDanYang0515/Maa-houtai.git
	
//	public JSONObject register(Sysuser user);
	//根据名字查找数据库
<<<<<<< HEAD
	public Sysuser findByusername(String username);
=======
//	public List<Sysuser> findByusername(String username);
>>>>>>> branch 'master' of https://github.com/LiDanYang0515/Maa-houtai.git
}
