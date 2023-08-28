package com.assecorAssessment.dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.assecorAssessment.model.Person;

public class CsvDataAccess implements DataAccess{
	
	 private String csvFilePath = "sample-input.csv";

	    @Override
	    public List<Person> getPersons() {
	        List<Person> persons = new ArrayList<>();
	        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
	            String[] nextLine;
	            while ((nextLine = reader.readNext()) != null) {
	            }
	        } catch (IOException | CsvValidationException e) {
	            // Handle IOException
	        }
	        return persons;
	    }

		@Override
		public Person getPersonById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Person> getPersonsByColor(String color) {
			// TODO Auto-generated method stub
			return null;
		}

}
