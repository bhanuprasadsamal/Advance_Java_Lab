package com.mycom.library.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycom.library.dao.BookDao;
import com.mycom.library.pojo.Book;

/**
 * Servlet implementation class BookInsertServlet
 */
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookDao bookDao = new BookDao();
		Book book = new Book();
		int rows =0;
		int bookId;
		String bookname,author;
		float price;
		
		bookId=Integer.parseInt(request.getParameter("bookId"));
		bookname=request.getParameter("bookname");
		author=request.getParameter("author");
		price= Float.parseFloat(request.getParameter("price"));
		try {
			//make the pojo ready with data
			book.setBookid(bookId);
			book.setBname(bookname);
			book.setAuthor(author);
			book.setPrice(price);
			rows= bookDao.insertBook(book);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(rows == 1) {
			System.out.println("Book data successfully insert");
			
		}else {
			System.out.println("Book data could not insert");
		}
		
	}

}
