package com.mycom.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycom.library.dao.BookDao;

/**
 * Servlet implementation class BookUpdateServlet
 */
public class BookUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookUpdateServlet() {
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
		int id;
		id = Integer.parseInt(request.getParameter("int"));
		try {
			rows = bookDao.updateBook(id);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(rows == 1) {
			System.out.println("Book Data successfully Updated");
			
		}else {
			System.out.println("Book data could not Updated");
		}
	}

}
