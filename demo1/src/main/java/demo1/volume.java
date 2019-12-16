package demo1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("volume/{width}/{depth}/{height}")
public class volume {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getVolume(@PathParam("width")int w,@PathParam("depth")int d,@PathParam("height")int h)
	{
		int vol = w*d*h;
		return "Volume = " + vol;
	}

}
