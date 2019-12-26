package edu.swjtuhc.demo.serviceImpl;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired
UserMapper userMapper;

@Override
public int  register(Sysuser user) {
	Sysuser user1 =  userMapper.findByusername(user.getUsername());
	int i = -1;
	if (user1==null) {
		i = userMapper.insertUser(user);
	}else{
		i= 2;
	}
	return i;
	// TODO Auto-generated method stub
}
@Override
public int login(Sysuser user) {
	Sysuser u1 = userMapper.findByusernameAndpassword(user.getUsername(),user.getPassword());
	int i = -1;
	if (u1==user){
		i = userMapper.loginUser(user);
	}else if (u1.getUsername()==null||u1.getPassword()==null) {
		i= 2;
	}else {
		i=3;
	}
	// TODO Auto-generated method stub
	return i;
}


}
