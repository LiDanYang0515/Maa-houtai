package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

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
	public int addTripItinerary(Itinerary in) {
		// TODO Auto-generated method stub
		int i = -1;
		i = itineraryMapper.insertin(in);
		return i;
	}

	@Override
	public List<Itinerary> getlastItinerary() {
		// TODO Auto-generated method stub
		return itineraryMapper.selectlastItinerary();
	}
}
