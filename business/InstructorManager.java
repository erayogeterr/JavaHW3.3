package kodlamaioHW33.business;

import kodlamaioHW33.Entity.Instructor;
import kodlamaioHW33.core.Logger;
import kodlamaioHW33.dataAccess.Abstract.AppDao;

public class InstructorManager {
	
	private AppDao appDao;
	private Logger[] loggers;
	
	
	public InstructorManager(AppDao appDao, Logger[] loggers) {
		this.appDao = appDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		this.appDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

	

}
