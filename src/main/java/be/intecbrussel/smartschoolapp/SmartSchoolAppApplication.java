package be.intecbrussel.smartschoolapp;

import be.intecbrussel.smartschoolapp.data.*;
import be.intecbrussel.smartschoolapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartSchoolAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SmartSchoolAppApplication.class, args);
	}

	@Autowired
	private StudentService studentService;
	@Autowired
	private ClassTeacherService classTeacherService;
	@Autowired
	private ParentService parentService;
	@Autowired
	private TimeTableService timeTableService;
	@Autowired
	private ResultsService resultsService ;







}
