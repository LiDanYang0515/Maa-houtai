package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ItineraryMapper;

import edu.swjtuhc.demo.model.Itinerary;
import edu.swjtuhc.demo.service.ItineraryService;

@Service
public class ItineraryServiceImpl implements ItineraryService{
@Autowired
private ItineraryMapper itineraryMapper;
@Override
public int addTtripSchedule(Itinerary in) {
	
	int i = -1;
	return i=itineraryMapper.insertin(in);
   
	// TODO Auto-generated method stub
	}

}

