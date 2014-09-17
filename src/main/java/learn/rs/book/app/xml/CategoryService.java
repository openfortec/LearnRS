package learn.rs.book.app.xml;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categoryservice")
@Produces(MediaType.APPLICATION_XML)
public class CategoryService {

	private CategoryDAO categoryDAO;
	
	
	@POST
	@Path("/category/{id}")
	public Category getCategory(@PathParam("id") String id) {
		System.out.println("getCategory called");
		Category cat = (Category) getCategoryDAO().getCategory(id);
		return cat;
	}
	
	/*@POST
	@Path("/category")
	@Consumes(MediaType.APPLICATION_XML)
	public void addCategory(Category category) {
		System.out.println("addCategory called");
		categoryDAO.addCategory(category);
	}
	

	@PUT
	@Path("/category")
	public void updateCategory(Category category) {
		System.out.println("updateCategory with category id : " + category.getCategoryId());
		categoryDAO.updateCategory(category);
	}
*/
	@DELETE
	@Path("/category/{id}")
	public void deleteCategory(@PathParam("id") String id) {
		System.out.println("deleteCategory with category id : " + id);
		getCategoryDAO().deleteCategory(id);
	}

	@POST
	@Path("/category/book")
	@Consumes("application/xml")
	public void addBooks(Category category) {
		System.out.println("addBooks with category id : " + category.getCategoryId());
		getCategoryDAO().addBook(category);

	}

	@GET
	@Path("/category/book/{id}")	
	public Collection<Book> getBooks(@PathParam("id") String id) {
		System.out.println("getBooks called with category id : " + id);

		Collection<Book> a=getCategoryDAO().getBooks(id);
		System.out.println(a);
		return a;
	}

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
