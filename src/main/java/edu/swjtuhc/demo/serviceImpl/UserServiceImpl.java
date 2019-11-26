package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserMapper userMapper;

@Override
public int register(Sysuser user) {
	// TODO Auto-generated method stub
	
	int i = userMapper.insertUser(user);
	return i;
}

@Override
public List<Sysuser> findByusernameAndpassword(String username, String password) {
	// TODO Auto-generated method stub
	
	
	return null;
}
}
