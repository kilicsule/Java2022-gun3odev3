package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.loggin.DatabaseLogger;
import kodlamaioDemo.core.loggin.EmailLogger;
import kodlamaioDemo.core.loggin.FileLogger;
import kodlamaioDemo.core.loggin.Logger;
import kodlamaioDemo.dataAccess.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.HibernateInstructorDao;
import kodlamaioDemo.dataAccess.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course(1, "Java", 60);
		Course course2 = new Course(2, "C#", 60);
		
		Course[] courses = {course1, course2};
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		
		Category category1 = new Category(1, "Android");
		Category category2 = new Category(2, "Android");
		
		Category[] categories = {category1, category2};
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		
		 CourseManager courseManager = new CourseManager(courses, new HibernateCourseDao(), loggers); 
		 courseManager.add(course1);
		 courseManager.add(course2);
		 
		
		
		 CategoryManager categoryManager = new CategoryManager(categories, new JdbcCategoryDao(), loggers); 
		 categoryManager.add(category1);
		 categoryManager.add(category2);
		  
		/*
		* InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers); 
		* instructorManager.add(instructor);
		*/
		 

	}

}
