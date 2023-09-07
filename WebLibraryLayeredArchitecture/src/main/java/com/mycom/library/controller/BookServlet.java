package com.mycom.library.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycom.library.dao.BookDao;
import com.mycom.library.pojo.Book;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Book book=new Book();
		List<Book>bookList=new ArrayList<Book>();
		BookDao bookDao = new BookDao();
		
		HttpSession session=request.getSession();
		
		out.println("Book Details");
		/*
		 * bookList=bookDao.getBooks(); for(Book book1: bookList) {
		 * out.println(book1.getBookid()); out.println(book1.getBname());
		 * out.println(book1.getAuthor()); out.println(book1.getPrice()); }
		 */
		session.setAttribute("booklist", bookList);
		RequestDispatcher reqDisp= request.getRequestDispatcher("/showBookDetails.jsp");
		reqDisp.forward(request, response);
	}

}