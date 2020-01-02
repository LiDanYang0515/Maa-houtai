package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Itinerary;

public interface ItineraryService {
	public  int addTripItinerary(Itinerary in) ;
	//查看
	public List<Itinerary> getlastItinerary ();
}
