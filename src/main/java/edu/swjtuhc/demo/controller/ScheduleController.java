package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Schedule;
import edu.swjtuhc.demo.service.ScheduleService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/sc")
public class ScheduleController {
	  @Autowired
	    ScheduleService scheduleService;
	    //写入
	    @RequestMapping("/addDaliySchedule")
	    public JSONObject addDaliyScehdule(@RequestBody Schedule sc) {
	    	
	    	JSONObject result = new JSONObject();
	    	//调用service层
	    	int i=scheduleService.addDaliySchedule (sc);
	    	result.put("state", i);
			return result;
	    }
	    //查看
	    @RequestMapping("/getlastSchedules")
	    public List<Schedule> getlastSchedules() {
	    	return scheduleService.getlastSchedules();
	    }
}
