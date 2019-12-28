package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.NicknamesMapper;
import edu.swjtuhc.demo.model.Nicknames;
import edu.swjtuhc.demo.service.NicknamesService;
@Service
public class NicknamesImpl implements NicknamesService{
	 @Autowired
	   private NicknamesMapper nicknamesMapper;
	@Override
	public int write(Nicknames nicknames) {
		// TODO Auto-generated method stub
		int i = -1;
		i = nicknamesMapper.insertNicknames(nicknames);
		return i;
	}

}
