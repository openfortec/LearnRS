package learn.sanga.rs.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/secondrs/{name}")
public class MySecondRsService {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getMessage(@PathParam("name") String name) {
		System.out.println("i am called" +name);
		return "<p>Welcome "+name+" to second example</p>";
	}
}
