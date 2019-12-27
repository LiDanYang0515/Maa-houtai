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
	int i = -1;
	i = signMapper.insertSign(sign);
//	if (sign2==null){
//		i = signMapper.insertSign(sign);
//	}else {
//		i = 2;
//	}
	return i;
}
   
   
}
