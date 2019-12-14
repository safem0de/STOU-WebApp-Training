package stou.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studentServlet")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		String firstName = request.getParameter("fname");
//		String lastName = request.getParameter("lname");
//		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		out.println("<html><body>");
		
		if(password.equals(cpassword))
		{
			
			out.println("The student is confirmed: "+ request.getParameter("fname")
			+ " "+ request.getParameter("lname"));
			out.println("<br>");
			out.println("Registration successful");
		}
		else
		{
			out.println("Registerationfails… try again");
		}
			
		out.println("</body></html>");
		out.close();
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
