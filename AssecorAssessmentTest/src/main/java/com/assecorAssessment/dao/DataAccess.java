package com.assecorAssessment.dao;

import java.util.List;

import com.assecorAssessment.model.Person;

public interface DataAccess {

	List<Person> getPersons();

	Person getPersonById(int id);

	List<Person> getPersonsByColor(String color);
}
