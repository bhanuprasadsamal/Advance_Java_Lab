<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,com.mycom.library.pojo.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<%
	ArrayList<Book> bookList = new ArrayList<Book>();
	bookList = (ArrayList<Book>)session.getAttribute("booklist");
	
%>
<table border='1'>
	<%
		for(Book book : bookList)
		{
			
		
	%>
	<tr>
		<td align="center"><%= book.getBookid() %></td>
		<td align="center"><%= book.getBname() %></td>
		<td align="center"><%= book.getAuthor() %></td>
		<td align="center"><%= book.getPrice() %></td>
		
	</tr>
	<%} %>
		
</table>

</body>
</html>