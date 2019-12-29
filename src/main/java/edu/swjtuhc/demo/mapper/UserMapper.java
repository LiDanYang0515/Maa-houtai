package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Sysuser;

@Mapper
public interface UserMapper {
	public Sysuser selectByusername(String username);
	public int insertUser(Sysuser user);
}
