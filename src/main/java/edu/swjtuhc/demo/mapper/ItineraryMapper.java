package edu.swjtuhc.demo.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.swjtuhc.demo.model.Sysuser;
import edu.swjtuhc.demo.model.Itinerary;

@Mapper
public interface ItineraryMapper {
	//根据日期查询数据库
		public  Itinerary selectItineraryBycreate_Date (@Param("create_Date")Date create_Date) ;
	//添加
		public  int insertin(Itinerary in) ;
		
		
		
}
