package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Itinerary;

@Mapper
public interface ItineraryMapper {
	//添加
		public  int insertin(Itinerary in) ;
		
		
		
}
