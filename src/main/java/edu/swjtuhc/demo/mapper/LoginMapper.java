package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Login;
import edu.swjtuhc.demo.model.Sysuser;

@Mapper
public interface LoginMapper {
	public Login selectByusername(String username);
	public Login selectBypassword(String password);
	
}
