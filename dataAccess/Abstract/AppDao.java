package kodlamaioHW33.dataAccess.Abstract;

import kodlamaioHW33.Entity.Category;
import kodlamaioHW33.Entity.Course;
import kodlamaioHW33.Entity.Instructor;

public interface AppDao {
	void add(Instructor instructor);
	void add(Category category);
	void add(Course course);

}
