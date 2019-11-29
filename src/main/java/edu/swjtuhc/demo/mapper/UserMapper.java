package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.Sysuser;
import net.sf.json.JSONObject;

@Mapper
public interface UserMapper {
	//添加
	public JSONObject insertUser(Sysuser user);
	//根据密码和名字查询数据库
	public List<Sysuser> findByusernameAndpassword(@Param("userName") String userName, @Param("userPassWord") String userPassWord);
	//根据名字查数据库
	public List<Sysuser> findByusername(String username);
//	public JSONObject findByuserName(Sysuser user);
	//public void register(Sysuser user);
}
