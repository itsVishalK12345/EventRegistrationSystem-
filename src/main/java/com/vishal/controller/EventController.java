package com.vishal.controller;



import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.vishal.model.*;
import com.vishal.service.EventService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EventController {
	@Autowired
	private EventService service;
@GetMapping("/")
public String registrationEvent() {
	return "home";
}

@GetMapping("/event")
public String showEventRegistrationPage() {
    return "event_regi";
}

@GetMapping("/search")
public String showSearchPage() {
    return "search";
}

@PostMapping("/register")
public String RegisterEvent(@ModelAttribute Event event,Model model) {
	String msg=service.saveEvent(event);
	model.addAttribute("msg",msg);
	return "success";
	
}

@PostMapping("/searchEvent")
public String findEventById(@RequestParam int id,Model model) {
	Event event=service.findEvent(id);
	model.addAttribute("event", event);
	return "displayEvent";
}
}
