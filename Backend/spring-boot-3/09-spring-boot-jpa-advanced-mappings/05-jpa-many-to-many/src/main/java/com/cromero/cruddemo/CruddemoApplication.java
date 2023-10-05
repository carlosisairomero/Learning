package com.cromero.cruddemo;

import com.cromero.cruddemo.dao.AppDao;
import com.cromero.cruddemo.entity.*;
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
//			createCourseAndStudents(appDao);
//			findCourseWithStudents(appDao);
//			findStudentWithCourses(appDao);
//			addMoreCoursesForStudent(appDao);
//			deleteCourse(appDao);
			deleteStudent(appDao);
		};
	}

	private void deleteStudent(AppDao appDao) {
		Integer id = 2;
		appDao.deleteStudentById(id);
		System.out.println("Student deleted");
	}

	private void addMoreCoursesForStudent(AppDao appDao) {
		Integer id = 2;
		Student student = appDao.findStudentAndItsCoursesByStudentId(id);
		student.addCourse(new Course("Course2"));
		student.addCourse(new Course("Course3"));
		appDao.update(student);
		System.out.println("Student updated");
	}

	private void findStudentWithCourses(AppDao appDao) {
		Integer id = 1;
		Student student = appDao.findStudentAndItsCoursesByStudentId(id);
		System.out.println(student);
		System.out.println(student.getCourses());
	}

	private void findCourseWithStudents(AppDao appDao) {
		Integer id = 10;
		Course course = appDao.findCourseAndItsStudentsByCourseId(id);
		System.out.println(course);
		System.out.println(course.getStudents());
	}

	private void createCourseAndStudents(AppDao appDao) {
		Course course = new Course("Course1");
		course.addStudent(new Student("Student1", "Student1", "student1@mail.com"));
		course.addStudent(new Student("Student2", "Student2", "student2@mail.com"));
		course.addStudent(new Student("Student3", "Student3", "student3@mail.com"));
		appDao.save(course);
		System.out.println("Course and Students saved.");
	}

	private void deleteCourseWithReviews(AppDao appDao) {
		Integer id = 10;
		appDao.deleteCourseById(id);
		System.out.println("Course and Reviews deleted");
	}

	private void findCourseWithReviews(AppDao appDao) {
		Integer id = 10;
		Course course = appDao.findCourseWithReviewsByCourseId(id);
		System.out.println(course);
		System.out.println(course.getReviews());
	}

	private void createCourseWithReviews(AppDao appDao) {
		Course course = new Course("Java");
		course.addReview(new Review("Good Java course"));
		course.addReview(new Review("Best Java course ever"));
		appDao.save(course);
		System.out.println("Course Save!");
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
