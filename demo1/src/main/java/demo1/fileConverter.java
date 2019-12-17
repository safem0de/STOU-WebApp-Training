package demo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.*;

@Path("fileConverter/{Name}/{Surname}/{Nickname}/{Birthyear}")
public class fileConverter {

	public static final DateFormat df = new SimpleDateFormat("yyyy");
	@GET
	@Produces("application/xml")
	public String calAge(@PathParam("Name") String name,@PathParam("Surname") String surname,@PathParam("Nickname") String nickname,@PathParam("Birthyear") int year) {
		
		Date date = new Date();
		String yr = df.format(date);
		
		int nowyr = Integer.parseInt(yr);
		int age = nowyr-year;
		
	return "<result>"//
		+"<name>"+ name +"</name>"//
		+"<lastname>"+ surname +"</lastname>"//
		+"<nickname>"+ nickname +"</nickname>"//
		+"<age>"+ age +"</age>"//
		+"</result>";
	}

}
