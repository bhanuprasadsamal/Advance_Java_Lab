package com.mycom.library.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycom.library.dao.BookDao;

/**
 * Servlet implementation class BookDeleteServlet
 */
public class BookDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookDao bookDao = new BookDao();
		int rows =0;
		int bookId;
		bookId = Integer.parseInt(request.getParameter("int"));
		PrintWriter out = response.getWriter();
		out.println("Book id"+bookId);
		try {
			rows = bookDao.deleteBook(bookId);
		}catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		if(rows == 1) {
			System.out.println("Book Data successfully deleted");
			
		}else {
			System.out.println("Book data could not deleted");
		}
	}

}
