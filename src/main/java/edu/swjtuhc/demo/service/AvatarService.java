package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Avatar;

public interface AvatarService {
	//长传头像
		public int avatar(Avatar avatar,InputStream fileStream);
}
