package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.Sysuser;
import net.sf.json.JSONObject;

@Mapper
public interface UserMapper {
	//根据名字查数据库
   public Sysuser findByusername(String username);
	//添加
	public int insertUser(Sysuser user);
	//登录
	public int loginUser(Sysuser user);
	//根据密码和名字查询数据库
//	public List<Sysuser> findByusernameAndpassword(@Param("userName") String userName, @Param("userPassWord") String userPassWord);
	//	public JSONObject findByuserName(Sysuser user);
	//public void register(Sysuser user);
}
