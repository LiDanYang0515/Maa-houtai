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
<<<<<<< HEAD
public Sysuser findByusernameAndpassword(String username, String password) {
=======
public int login(Sysuser user) {
	Sysuser u1 = userMapper.findByusernameAndpassword(user.getUsername(),user.getPassword());
	int i = -1;
	if (u1==user){
		i = userMapper.loginUser(user);
	}else if (user.getUsername()==null||user.getPassword()==null) {
		i= 2;
	}else {
		i=3;
	}
>>>>>>> branch 'master' of https://github.com/LiDanYang0515/Maa-houtai.git
	// TODO Auto-generated method stub
<<<<<<< HEAD
	return null;
=======
	return i;
>>>>>>> branch 'master' of https://github.com/LiDanYang0515/Maa-houtai.git
}

<<<<<<< HEAD
@Override
public Sysuser findByusername(String username) {
	// TODO Auto-generated method stub
	return null;
}
=======
>>>>>>> branch 'master' of https://github.com/LiDanYang0515/Maa-houtai.git

}
