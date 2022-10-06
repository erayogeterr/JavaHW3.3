package kodlamaioHW33.business;

import kodlamaioHW33.Entity.Course;
import kodlamaioHW33.core.Logger;
import kodlamaioHW33.dataAccess.Abstract.AppDao;

public class CourseManager {

	private AppDao appDao;
	private Logger[] loggers;

	public CourseManager(AppDao appDao, Logger[] loggers) {
		this.appDao = appDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course course1 = new Course(1, "Java Kursu", 500);
		Course course2 = new Course(2, "C# Kursu", 1000);
		Course[] courses = { course1, course2 };

		for (Course c : courses) {
			if (c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Aynı isimde kurs mevcut.");
			} else if (course.getCoursePrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
			} 
		}
			this.appDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
	}




















//if (course.getCoursePrice() < 0) {
//	throw new Exception("Kurs fiyatı 0 'dan küçük olamaz.");
//}
//else if (course.getCourseName().equals(course.getCourseName())){
//	throw new Exception("Aynı kurs adı mevcut");
//}
//else {
//	this.appDao.add(course);
//	for (Logger logger : loggers) {
//		logger.log(course.getCourseName());
//	}
