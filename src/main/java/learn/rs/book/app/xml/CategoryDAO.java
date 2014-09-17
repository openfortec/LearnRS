package learn.rs.book.app.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CategoryDAO {
	//The two different map create for easy object manipulation 
	//otherwise we can have only one map called categoryMap which contain book information
	private static Map<String, Category> categoryMap = new HashMap<String, Category>();
	private static Map<String, Collection<Book>> bookMap = new HashMap<String, Collection<Book>>();

	static {
		// For testing data instead of connecting DB, get from here
		Category category1 = new Category();
		category1.setCategoryId("001");
		category1.setCategoryName("Java");
		categoryMap.put(category1.getCategoryId(), category1);

		Collection<Book> booksList = new ArrayList<Book>();

		Book book1 = new Book();
		book1.setAuthor("Naveen Balani");
		book1.setBookName("Spring Series");
		book1.setBookId("001");
		book1.setBookISBNnumber("ISB001");

		Book book2 = new Book();
		book2.setAuthor("Rajeev Hathi");
		book2.setBookName("CXF Series");
		book2.setBookId("002");
		book2.setBookISBNnumber("ISB002");

		booksList.add(book1);
		booksList.add(book2);
		bookMap.put(category1.getCategoryId(), booksList);
		// category1.setBooks(booksList);
	}

	// add only category
	public void addCategory(Category category) {
		categoryMap.put(category.getCategoryId(), category);
	}

	// get category
	public Category getCategory(String id) {
		return categoryMap.get(id);
	}

	public void updateCategory(Category category) {
		categoryMap.put(category.getCategoryId(), category);
	}

	public void deleteCategory(String id) {
		categoryMap.remove(id);
		bookMap.remove(id);
	}

	// Add Books associated with the Category
	public void addBook(Category category) {
		bookMap.put(category.getCategoryId(), category.getBooks());
	}

	public Collection<Book> getBooks(String categoryId) {
		return bookMap.get(categoryId);
	}

}
