package demo1;
import java.text.*;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.*;

@Path("Currency_XML/{baths}/{dollars}")
public class Currency_XML {
	
	public static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	@GET
	@Produces("application/xml")
	public String getDollars(@PathParam("baths") float bathFloat,@PathParam("dollar") float dollarFloat)
	{
		Date date = new Date();
		String dateStr = df.format(date);
		
		float[] dollars = new float[]{30.15f,32.20f,33.50f};
		int i = new Random().nextInt(3);
		float d = dollars[i];
		String rateStr = Float.toString(d);
		String bathStr = "";
		String dollarStr = "";
		
		if(bathFloat != 0.00)
			dollarStr = Float.toString(bathFloat/d);
		if(dollarFloat != 0.00)
			bathStr = Float.toString(d*dollarFloat);
		
		return "<currency>"//
				+"<date>"+ dateStr +"</date>"//
				+"<rate>"+ rateStr +"</rate>"//
				+"<dollars>"+ dollarStr +"</dollars>"//
				+"<baths>"+ bathStr +"</baths>"//
				+"<currency>";
	}
}
