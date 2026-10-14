package com.vishal.service;




import org.springframework.stereotype.Service;
import com.vishal.repository.EventRepository ;

import com.vishal.model.Event;
@Service
public class EventService {
  
	
	private final EventRepository repository ;

	EventService(EventRepository repository) {
		this.repository = repository;
	}
	
	public String saveEvent(Event event ) {
		repository.save(event);
		return "Event Register Successfully";
	}
	
	public Event findEvent(int id){
		return repository.findById(id).orElseThrow();
	}
}
