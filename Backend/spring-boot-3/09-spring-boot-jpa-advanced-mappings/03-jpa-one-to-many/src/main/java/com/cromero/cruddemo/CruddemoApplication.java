package com.cromero.cruddemo;

import com.cromero.cruddemo.dao.AppDao;
import com.cromero.cruddemo.entity.Course;
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
//			deleteInstructorDetail(appDao);
//			createInstructorWithCourses(appDao);
//			findInstructorWithCoursesWillFailDueToLazy(appDao);
//			findInstructorWithCoursesSolution1Requiring2Queries(appDao);
//			findInstructorWithCoursesSolution2Only1Query(appDao);
//			updateInstructor(appDao);
//			updateCourse(appDao);
//			deleteInstructor(appDao);
			deleteCourse(appDao);
		};
	}

	private void deleteCourse(AppDao appDao) {
		Integer id = 10;
		appDao.deleteCourseById(id);
		System.out.println("Course deleted");
	}

	private void deleteInstructor(AppDao appDao) {
		Integer id = 1;
		appDao.deleteInstructorById(id);
		System.out.println("Instructor deleted");
	}

	private void updateCourse(AppDao appDao) {
		Integer id = 10;
		Course course = appDao.findCourseById(id);
		course.setTitle("Updated");
		appDao.update(course);
		System.out.println("Course updated");
	}

	private void updateInstructor(AppDao appDao) {
		Integer id = 1;
		Instructor instructor = appDao.findInstructorById(id);
		instructor.setFirstName("Updated");
		instructor.setLastName("Updated");
		appDao.update(instructor);
		System.out.println("Instructor updated");
	}

	private void findInstructorWithCoursesSolution2Only1Query(AppDao appDao) {
		Integer id = 1;
		Instructor instructor = appDao.findCoursesByInstructorIdUsingJoinFetch(id);
		System.out.println(instructor);
		System.out.println(instructor.getCourses());
	}

	private void findInstructorWithCoursesSolution1Requiring2Queries(AppDao appDao) {
		Integer id = 1;
		Instructor instructor = appDao.findInstructorById(id); // It's Lazy... will return only the instructor
		instructor.setCourses(appDao.findCoursesByInstructorId(id)); // will retrieve all the courses for that instructor
		System.out.println(instructor);
		System.out.println(instructor.getCourses());
	}

	private void findInstructorWithCoursesWillFailDueToLazy(AppDao appDao) {
		int id = 1;
		Instructor instructor = appDao.findInstructorById(id);
		System.out.println(instructor);
		System.out.println(instructor.getCourses());
	}

	private void createInstructorWithCourses(AppDao appDao) {
		Instructor instructor = new Instructor("Carlos", "Romero", "carlos@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("http://www.carlos.com/youtube","Hobby");
		instructor.setInstructorDetail(instructorDetail);
		instructor.addCourse(new Course("Course1"));
		instructor.addCourse(new Course("Course2"));
		instructor.addCourse(new Course("Course3"));
		appDao.save(instructor);
		System.out.println("Instructor saved!");
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
