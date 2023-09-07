import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("/text.html");
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			out.print("Welcome " + name + "<br>");
			out.print("<form action='ServletTwo' method='post'>");
			out.print("Enter Contact Details : <br>");
			out.print("Address : <input type='text' name='address'><br>");
			
			out.print("<input type='hidden' name='name' value='" + name + "'>");
			out.print("<input type='submit' value='Proceed..!'>");
			out.print("</form>");
			out.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}