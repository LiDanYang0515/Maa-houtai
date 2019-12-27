package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Sign;

@Mapper
public interface SignMapper {
// 添加数据
	public int insertSign(Sign sign);
}
