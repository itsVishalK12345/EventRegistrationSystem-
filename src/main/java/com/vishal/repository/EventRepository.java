package com.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{

}
