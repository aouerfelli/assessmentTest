package com.assecorAssessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.assecorAssessment.dao.DataAccess;
import com.assecorAssessment.dao.CsvDataAccess;

@SpringBootApplication
public class AssecorAssessment {

	public static void main(String[] args) {
		 SpringApplication.run(AssecorAssessment.class, args);
	}
	
	   @Bean
	    public DataAccess csvDataAccess() {
	        return new CsvDataAccess();
	    }
}
