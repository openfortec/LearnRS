package learn.rs.book.app.xml;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/catgoryService")
@Produces(MediaType.APPLICATION_XML)
public class CategoryService {

	@POST
	@Path("/category/{id}")
	public Category getCategory(@PathParam("id") String id) {
		return null;
	}

	@POST
	@Path("/category")
	@Consumes(MediaType.APPLICATION_XML)
	public void addCategory(Category category) {

	}

	@DELETE
	@Path("/category/{id}")
	public void deleteCategory(@PathParam("id") String id) {
	}

	@PUT
	@Path("/category")
	public void updateCategory(Category category) {
	}

	@POST
	@Path("/category/book")
	@Consumes("application/xml")
	public void addBooks(Category category) {
	}

	@GET
	@Path("/category/{id}/books")
	@Consumes("application/xml")
	public void getBooks(@PathParam("id") String id) {
	}
}
