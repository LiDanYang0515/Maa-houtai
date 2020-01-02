package edu.swjtuhc.demo.controller;

import java.util.List;

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
	 @RequestMapping("/addTripItinerary")
	    public JSONObject addTripItinerary(@RequestBody Itinerary in) {
	    	
	    	JSONObject result = new JSONObject();
	    	//调用service层
	    	int i=itineraryService.addTripItinerary (in);
	    	result.put("state", i);
			return result;
	    }
	  @RequestMapping("/getlastItinerary")
	    public List<Itinerary> getlastItinerary() {
	    	return itineraryService.getlastItinerary();
	    }
}
