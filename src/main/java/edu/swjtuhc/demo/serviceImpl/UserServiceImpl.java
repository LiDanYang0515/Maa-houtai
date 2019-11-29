package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserMapper userMapper;

@Override
public JSONObject register(Sysuser user) {
	return userMapper.insertUser(user);
	// TODO Auto-generated method stub
}
@Override
public List<Sysuser> findByusernameAndpassword(String username, String password) {
	// TODO Auto-generated method stub
	
	
	return userMapper.findByusernameAndpassword(username,password);
}

@Override
public List<Sysuser> findByusername(String username) {
	// TODO Auto-generated method stub
	return userMapper.findByusername(username);
}
}
