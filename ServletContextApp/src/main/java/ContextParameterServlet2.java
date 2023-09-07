

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextParameterServlet2
 */
public class ContextParameterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextParameterServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String username="";
    private String email="";
    
    public void init(ServletConfig config)throws ServletException{
    	super.init(config);
    	
    	ServletContext context = getServletContext();
    	username = context.getInitParameter("username");
    	email= context.getInitParameter("email");
    }


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//resp.setContentType("text/html");
		out.println("<html><head><title>Servlet Context Page</title></head>");
		out.println("<body>ln ContextParameterServlet2-Username is <b>"+username);
		out.println("</b><br>Email is <b>"+email+"</b>");
		out.println("</body></html>");
	}

}
