package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına kaydedildi: " + category.getCategoryName());
		
	}

}
