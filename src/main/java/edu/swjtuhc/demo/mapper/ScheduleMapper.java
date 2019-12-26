package edu.swjtuhc.demo.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.Schedule;

@Mapper
public interface ScheduleMapper {
	//根据日期查询数据库
		public Schedule selectScheduleBycreate_Date (@Param("create_Date")Date create_Date) ;
	//添加
		public  int insertsc(Schedule sc) ;
}
