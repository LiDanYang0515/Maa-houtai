package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ItineraryMapper;
import edu.swjtuhc.demo.mapper.ScheduleMapper;
import edu.swjtuhc.demo.model.Itinerary;
import edu.swjtuhc.demo.service.ItineraryService;

@Service
public class ItineraryServiceImpl implements ItineraryService{
@Autowired
private ItineraryMapper itineraryMapper;

public int addTtripSchedule(Itinerary in) {
	Itinerary it=  itineraryMapper.selectItineraryBycreate_Date(in.getCreate_Date());
	int i = -1;
	if(it==null) {
		i=itineraryMapper.insertin(in);
    }else {
		i= 2;
	}
	return i;
	// TODO Auto-generated method stub
	}

}

