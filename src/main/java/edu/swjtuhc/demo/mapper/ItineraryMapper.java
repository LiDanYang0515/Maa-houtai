package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Itinerary;
@Mapper
public interface ItineraryMapper {
	//添加
			public  int insertin(Itinerary in) ;
			//查看
			public List<Itinerary> selectlastItinerary();
}
