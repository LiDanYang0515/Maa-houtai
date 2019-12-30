package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Avatar;

@Mapper
public interface AvatarMapper {
	//头像上传
		public int insertAvatar(Avatar avatar);
}
