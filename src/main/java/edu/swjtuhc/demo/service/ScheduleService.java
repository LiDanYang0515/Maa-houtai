package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Schedule;

public interface ScheduleService {
	//写入
		public  int addDaliySchedule(Schedule sc) ;
	//查看
		public List<Schedule> getlastSchedules ();
}
