package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.LoginMapper;
import edu.swjtuhc.demo.model.Login;
import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginMapper loginMapper;
	@Override
	public int login(Login user) {
		// TODO Auto-generated method stub
		loginMapper.selectByusername(user.getUsername());
		Sysuser u = new Sysuser();
		Sysuser p = new Sysuser();
		int i = -1;
		if(u==null&&p==null){
			i = 3;
       }else if (u.equals(user.getUsername())||p.equals(user.getPassword())) {
			i = 2;
		}else {
			i = 1;
		}
		return i;
	}

}
