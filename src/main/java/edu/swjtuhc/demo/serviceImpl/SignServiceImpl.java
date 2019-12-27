package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.SignMapper;
import edu.swjtuhc.demo.model.Sign;
import edu.swjtuhc.demo.service.SignService;

@Service
public class SignServiceImpl implements SignService{
   @Autowired
   private SignMapper signMapper;

@Override
public int write(Sign sign) {
	// TODO Auto-generated method stub
	Sign sign2 = new Sign();
	int i = -1;
	if (sign==null||"".equals(sign)) {
		i = 2; 
	}else {
		i = signMapper.insertSign(sign);
	}
	return i;
}
   
   
}
