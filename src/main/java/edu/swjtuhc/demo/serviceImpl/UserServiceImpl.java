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
public int  register(Sysuser user) {
	Sysuser user1 = (Sysuser) userMapper.findByusername(user.getUsername());
	int i = -1;
	if (user1==null) {
		i = userMapper.insertUser(user);
	}else {
		i= 2;
	}
	return i;
	// TODO Auto-generated method stub
}

@Override
public Sysuser findByusernameAndpassword(String username, String password) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Sysuser findByusername(String username) {
	// TODO Auto-generated method stub
	return null;
}

}
