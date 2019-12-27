package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Schedule;

@Mapper
public interface ScheduleMapper {
	//添加
		public  int insertsc(Schedule sc) ;
}
