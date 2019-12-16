package demo1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("firstService")
public class firstService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRespone()
	{
		return "Hello Mf";
	}
}
