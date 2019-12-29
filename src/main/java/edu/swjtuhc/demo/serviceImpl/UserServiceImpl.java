package edu.swjtuhc.demo.serviceImpl;

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
		// TODO Auto-generated method stub
		Sysuser user1 = userMapper.selectByusername(user.getUsername());
		int i = -1;
		if (user1==null) {
			i = userMapper.insertUser(user);
		}else {
			i= 2;
		}
		return i;
		
	}
}
