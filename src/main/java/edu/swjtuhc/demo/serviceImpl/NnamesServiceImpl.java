package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.NnamesMapper;
import edu.swjtuhc.demo.mapper.SignMapper;
import edu.swjtuhc.demo.model.Nnames;
import edu.swjtuhc.demo.service.NnamesService;

@Service
public class NnamesServiceImpl implements NnamesService{
	@Autowired
	   private NnamesMapper nnamesMapper;

	@Override
	public int write(Nnames nnames) {
		// TODO Auto-generated method stub
		int i = -1;
		i = nnamesMapper.insertNnames(nnames);
		return i;
	}
	
}
