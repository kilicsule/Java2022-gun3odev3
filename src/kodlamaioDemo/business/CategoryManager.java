package kodlamaioDemo.business;

import kodlamaioDemo.core.loggin.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	
	private Category[] categories;
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(Category[] categories, CategoryDao categoryDao, Logger[] loggers) {
		this.categories = categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		for(int i = 1; i < categories.length ; i++) {
			String courseName = categories[0].getCategoryName();
			if(courseName == categories[i].getCategoryName() ) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		categoryDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
