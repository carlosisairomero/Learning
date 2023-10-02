package com.cromero.cruddemo;

import com.cromero.cruddemo.dao.StudentDAO;
import com.cromero.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner ->  {
			createStudent(studentDAO);
//			readStudentById(studentDAO);
//			queryFindAllStudents(studentDAO);
//			queryFindStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int deletedCount = studentDAO.deleteAll();
		System.out.println("Deleted Students: " + deletedCount);
		System.out.println("All the students have been deleted");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.deleteById(1);
		System.out.println("Student with id = 1 deleted.");
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student studentToUpdate = studentDAO.findById(1);
		studentToUpdate.setFirstName("FirstName updated");
		studentToUpdate.setLastName("FirstLastName updated");
		studentDAO.update(studentToUpdate);
		System.out.println("Updated Student: " + studentToUpdate);
	}

	private void queryFindStudentsByLastName(StudentDAO studentDAO) {
		Student student = new Student("Carlos", "Romero", "carlos@mail.com");
		Student student2 = new Student("Nathalia", "Romero", "nathalia@mail.com");
		studentDAO.save(student);
		studentDAO.save(student2);
		List<Student> students = studentDAO.findByLastName("Romero");
		students.forEach(System.out::println);
	}

	private void queryFindAllStudents(StudentDAO studentDAO) {
		Student student = new Student("Allan", "Smith", "allan@mail.com");
		Student student2 = new Student("Maria", "Docker", "maria@mail.com");
		studentDAO.save(student);
		studentDAO.save(student2);
		List<Student> students = studentDAO.findAll();
		students.forEach(System.out::println);
	}

	private void readStudentById(StudentDAO studentDAO) {
		Student student = new Student("Paul", "Doe", "paul@mail.com");
		studentDAO.save(student);
		System.out.println("Generated id: " + student.getId());
		System.out.println("Retrieving student with id: " + student.getId());
		Student retrievedStudent = studentDAO.findById(student.getId());
		System.out.println("Retrieved student: " + retrievedStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Paul", "Doe", "paul@mail.com");
		studentDAO.save(student);
		System.out.println("Generated id: " + student.getId());
	}

}
