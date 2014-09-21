package learn.sanga.rs.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/secondrs")
public class MySecondRsService {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getMessage() {
	
		return "<p>Hello second RESTFUL Web Service</p>";
	}
}
