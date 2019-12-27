package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Itinerary;

import edu.swjtuhc.demo.service.ItineraryService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/in")
public class ItineraryController {
	  @Autowired
	    ItineraryService itineraryService;
	    //写入
	    @RequestMapping("/addTtripSchedule")
	    public JSONObject addTtripSchedule(@RequestBody Itinerary in) {
	    	JSONObject result = new JSONObject();
	    	//调用service层
	    	Object i=itineraryService.addTtripSchedule(in);
	    	result.put("state", i);
			return result;
	    }
}
