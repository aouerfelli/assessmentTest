package com.assecorAssessment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assecorAssessment.model.Person;
import com.assecorAssessment.dao.DataAccess;


@RestController
@RequestMapping("/api/persons")
public class PersonsController {
	
	    private final DataAccess dataAccess;

	    public PersonsController(DataAccess dataAccess) {
	        this.dataAccess = dataAccess;
	    }

	    @GetMapping
	    public List<Person> getPersons() {
	        return dataAccess.getPersons();
	    }

	    @GetMapping("/{id}")
	    public Person getPersonById(@PathVariable int id) {
	        return dataAccess.getPersonById(id);
	    }

	    @GetMapping("/color/{color}")
	    public List<Person> getPersonsByColor(@PathVariable String color) {
	        return dataAccess.getPersonsByColor(color);
	    
}
}
	  
