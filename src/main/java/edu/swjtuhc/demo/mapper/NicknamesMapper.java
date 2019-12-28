package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Nicknames;

@Mapper
public interface NicknamesMapper {
	// 添加数据
		public int insertNicknames(Nicknames nicknames);
}
