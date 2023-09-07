import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			String username = null, password = null;
			username = request.getParameter("username");
			password = request.getParameter("password");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet FormParameters</title>");
			out.println("</head>");
			out.println("<body bgcolor='YELLOW'>");
			out.println("<center>");
			
			out.println("<h3>User Name : " + username + "</h3>");
			out.println("<h3>Password : " + password + "</h3>");
			
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		}
		finally {
			out.close();
		}
	}

}