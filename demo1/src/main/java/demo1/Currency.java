package demo1;

import java.text.*;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("Currency/{baths}/{dollars}")
public class Currency {
	
	private static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getDollars(@PathParam("baths")float bathFloat,@PathParam("dollar") float dollarFloat) {
		Date date = null;
		date = new Date();
		String dateStr = "";
		dateStr = df.format(date);
		
		float[]dollars = new float[] {30.15f,32.20f,33.50f};
		int i = new Random().nextInt(3);
		float d = dollars[i];
		String rateStr = Float.toString(d);
		
		String bathStr = "";
		String dollarStr = "";
		
		if(bathFloat != 0.00)
			dollarStr = Float.toString(bathFloat/d);
		if(dollarFloat != 0.00)
			bathStr = Float.toString(d*dollarFloat);
		
		return "Today rate = "+ rateStr + " $ : "+ dollarStr + " Bath : "+ bathStr + " Date :" + dateStr;
	}
}
