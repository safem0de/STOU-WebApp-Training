package demo1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("Info")
public class Info {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRespone()
	{
		return "Hello Info";
	}
}
