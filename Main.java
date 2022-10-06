package kodlamaioHW33;

import kodlamaioHW33.Entity.Category;
import kodlamaioHW33.Entity.Course;
import kodlamaioHW33.Entity.Instructor;
import kodlamaioHW33.business.CategoryManager;
import kodlamaioHW33.business.CourseManager;
import kodlamaioHW33.business.InstructorManager;
import kodlamaioHW33.core.DatabaseLogger;
import kodlamaioHW33.core.FileLogger;
import kodlamaioHW33.core.Logger;
import kodlamaioHW33.dataAccess.Concrete.HibernateDao;
import kodlamaioHW33.dataAccess.Concrete.JDBCDao;

public class Main {

	public static void main(String[] args) throws Exception {
		//Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		//Course course = new Course(3,"Python Kursu",1000);
		//Instructor instructor = new Instructor(1,"Engin","Demiroğ");
		//Category category = new Category(2,"Eşya");
		
		
		//CourseManager courseManager = new CourseManager(new JDBCDao(), loggers);
		//courseManager.add(course);
		
		//InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		//instructorManager.add(instructor);
		
		//CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		//categoryManager.add(category);
	}
}
