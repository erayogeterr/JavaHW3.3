package kodlamaioHW33.dataAccess.Concrete;

import kodlamaioHW33.Entity.Category;
import kodlamaioHW33.Entity.Course;
import kodlamaioHW33.Entity.Instructor;
import kodlamaioHW33.dataAccess.Abstract.AppDao;

public class JDBCDao implements AppDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor JDBC ile eklendi. --> " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Category JDBC ile eklendi. --> " + category.getCategoryName());
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Course JDBC ile eklendi. --> " + course.getCourseName());
		
	}

}
