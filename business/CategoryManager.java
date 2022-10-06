package kodlamaioHW33.business;

import kodlamaioHW33.Entity.Category;
import kodlamaioHW33.core.Logger;
import kodlamaioHW33.dataAccess.Abstract.AppDao;

public class CategoryManager {
	
	private AppDao appDao;
	private Logger[] loggers;
	
	public CategoryManager(AppDao appDao, Logger[] loggers) {
		this.appDao = appDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		Category category1 = new Category(1, "Programlama");
		Category[] categories = {category1};
		
		for (Category c : categories) {
			if (c.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Aynı isimde kategori mevcut.");
			}
		}
		this.appDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}