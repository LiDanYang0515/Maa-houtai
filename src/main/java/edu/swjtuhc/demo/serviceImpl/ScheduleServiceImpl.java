package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ItineraryMapper;
import edu.swjtuhc.demo.mapper.ScheduleMapper;
import edu.swjtuhc.demo.model.Itinerary;
import edu.swjtuhc.demo.model.Schedule;
import edu.swjtuhc.demo.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService{
@Autowired
private ScheduleMapper scheduleMapper;

public int addDaliySchedule(Schedule sc) {
	Schedule it1=scheduleMapper.selectScheduleBycreate_Date(sc.getCreate_Date());
	
	int i = -1;
	if(it1==null) {
		i=scheduleMapper.insertsc(sc);
	}else {
		i= 2;
	}
	return i;
	// TODO Auto-generated method stub
}
}
