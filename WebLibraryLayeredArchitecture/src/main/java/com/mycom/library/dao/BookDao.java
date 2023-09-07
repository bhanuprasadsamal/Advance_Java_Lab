package com.mycom.library.dao;

import com.mycom.library.dataconn.ConnectToDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.mycom.library.pojo.Book;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {
	//jdbc api classes for data retrival
	private Connection connection=null;
	private PreparedStatement statement=null;
	private ResultSet resultSet=null;
	
	
	//Book book=new Book;
	ArrayList<Book>bookList=new ArrayList<Book>();
	private static String bookQry="select * from book order by bookId";
	
	public ArrayList getBooks() throws ClassNotFoundException,SQLException {
		try {
			//open the connection
			connection=ConnectToDB.createConnection();
			//create statement
			statement= connection.prepareStatement(bookQry);
			//get the result
			resultSet=statement.executeQuery();
			
			while(resultSet.next()) {
				int id;
				String name;
				String author;
				float price;
				//declare the pojo
				Book book=new Book();
				//get the row details
				id =resultSet.getInt(1);
				name = resultSet.getString(2);
				author= resultSet.getString(3);
				price=resultSet.getFloat(4);
				//set the pojo with retrived values from the row
				book.setBookid(id);
				book.setBname(name);
				book.setAuthor(author);
				book.setPrice(price);
				//add the book to booklist
				bookList.add(book);
			}//end of while loop
		}catch(SQLException sqlex) {
			sqlex.printStackTrace();
			
		}finally {
			//close the connection
			//now data is in array list object no need to keep the connection opened
			ConnectToDB.closeConnection();
		}
		return bookList;
	}//end of getBooks() method
	public int insertBook(Book book) throws ClassNotFoundException {
		int rows=0;
		try {
			connection=ConnectToDB.createConnection();
			//system.out.println("Connection object-"+connection);
			PreparedStatement pstmt= connection.prepareStatement("insert into book(bookId,bookname,author,price) values(?,?,?,?)");
			pstmt.setInt(1, book.getBookid());
			pstmt.setString(2, book.getBname());
			pstmt.setString(3, book.getAuthor());
			pstmt.setFloat(4, book.getPrice());
			rows=pstmt.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return rows;
	}
	
	//update book
	public int updateBook(int bookId) throws ClassNotFoundException{
		int rows=0;
		try {
			connection=ConnectToDB.createConnection();
			PreparedStatement pstmt=
					connection.prepareStatement("update book set price=price+price *0.25 where bookId=?");
			pstmt.setInt(1, bookId);
			rows=pstmt.executeUpdate();
			connection.commit();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return rows;
	}
	public int deleteBook(int bookId) throws ClassNotFoundException,SQLException{
		int rows=0;
		connection=ConnectToDB.createConnection();
		try {
			PreparedStatement pstmt=
					connection.prepareStatement("delete from book where bookId=?");
			pstmt.setInt(1, bookId);
			rows=pstmt.executeUpdate();
			//connection.commit();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return rows;
	}
	
	
	
	
	
	
}