package demo1;

import java.text.*;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("BathsToDollars/{baths}")
public class BathsToDollars {
	
	private static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getDollars(@PathParam("baths")float bathFloat) {
		Date date = null;
		date = new Date();
		String dateStr = "";
		dateStr = df.format(date);
		
		float[]dollars = new float[] {30.15f,32.20f,33.50f};
		int i = new Random().nextInt(3);
		float d = dollars[i];
		String r = Float.toString(d);
		String s = Float.toString(bathFloat/d);
		
		return "Today rate = "+ r + "$"+ s + " Date "+dateStr;
	}
}
