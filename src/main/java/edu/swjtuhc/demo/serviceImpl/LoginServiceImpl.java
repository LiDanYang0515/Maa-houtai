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
		Login u = loginMapper.selectByusername(user.getUsername());
		Login p = loginMapper.selectBypassword(user.getPassword());
		int i = -1;
		if(u==null||u.equals(user.getUsername())){
			i = 3;
       }else if (p==null||p.equals(user.getPassword())) {
			i = 2;
		}else {
			i = 1;
		}
		return i;
	}

}
