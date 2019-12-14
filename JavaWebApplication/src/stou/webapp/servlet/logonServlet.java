package stou.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logonServlet")
public class logonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = request.getParameter("uname");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		out.println("<html><body>");
		
		if(userName.equals("admin") && password.equals("javawebappsanookjung"))
		{
			out.println("Welcome "+ userName);
		}
		else
		{
			out.println("Login name or password is incorrect");
		}
			
		out.println("</body></html>");
		out.close();
	}

}
