package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ScheduleMapper;

import edu.swjtuhc.demo.model.Schedule;
import edu.swjtuhc.demo.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService{
@Autowired
private ScheduleMapper scheduleMapper;

public int addDaliySchedule(Schedule sc) {
	int i = -1;
	return i=scheduleMapper.insertsc(sc);
	
	// TODO Auto-generated method stub
}

@Override
public List<Schedule> getlastSchedules() {
	// TODO Auto-generated method stub
	return scheduleMapper.selectlastSchedules();
}
}
