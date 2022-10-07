package kodlamaioDemo.business;

import kodlamaioDemo.core.loggin.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	
	private Course[] courses;
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(Course[] courses, CourseDao courseDao, Logger[] loggers) {
		this.courses = courses;
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getUnitPrice()<0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		for(int i = 1; i < courses.length ; i++) {
			String courseName = courses[0].getCourseName();
			if(courseName == courses[i].getCourseName() ) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}
}
