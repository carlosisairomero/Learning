package com.cromero.cruddemo;

import com.cromero.cruddemo.dao.AppDao;
import com.cromero.cruddemo.entity.Instructor;
import com.cromero.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
//			createInstructor(appDao);
//			findInstructor(appDao);
//			deleteInstructor(appDao);
//			findInstructorDetail(appDao);
			deleteInstructorDetail(appDao);
		};
	}

	private void deleteInstructorDetail(AppDao appDao) {
		Integer id = 3;
		appDao.deleteInstructorDetailById(id);
		System.out.println("Instructor Detail deleted");
	}

	private void findInstructorDetail(AppDao appDao) {
		Integer id = 2;
		InstructorDetail instructorDetail = appDao.findInstructorDetailById(id);
		System.out.println(instructorDetail);
		System.out.println(instructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDao appDao) {
		Integer id = 1;
		appDao.deleteInstructorById(id);
		System.out.println("Instructor deleted");
	}

	private void findInstructor(AppDao appDao) {
		Integer id = 1;
		Instructor instructor = appDao.findInstructorById(id);
		System.out.println(instructor);
	}

	private void createInstructor(AppDao appDao) {
		Instructor instructor = new Instructor("Carlos", "Romero", "carlos@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("http://www.carlos.com/youtube","Hobby");
		instructor.setInstructorDetail(instructorDetail);
		appDao.save(instructor);
		System.out.println("Instructor Saved");
	}

}
