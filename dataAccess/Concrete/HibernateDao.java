package kodlamaioHW33.dataAccess.Concrete;

import kodlamaioHW33.Entity.Category;
import kodlamaioHW33.Entity.Course;
import kodlamaioHW33.Entity.Instructor;
import kodlamaioHW33.dataAccess.Abstract.AppDao;

public class HibernateDao implements AppDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor hibernate ile eklendi. --> " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Category hibernate ile eklendi. --> " + category.getCategoryName() + category.getId());		
	}

	@Override
	public void add(Course course) {
		System.out.println("Course hibernate ile eklendi. --> " + course.getCourseName());		
	}



}
