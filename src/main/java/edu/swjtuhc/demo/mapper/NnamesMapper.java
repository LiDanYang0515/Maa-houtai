package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Nnames;

@Mapper
public interface NnamesMapper {
	// 添加数据
		public int insertNnames(Nnames nnames);
}
