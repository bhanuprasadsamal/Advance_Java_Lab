<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body bgcolor="Green">
<font face="calibri" size="8" color="yellow">
<b>Static Content: </b>Hello World!
<br>
<b>Script: <br></b>
<%
	for(int num=1;num<=10;num++){
		out.println(num +"<br>");
	}
	float salary;
	salary=10000.00f;
%>
<br>
<b>Declaration: </b>
<%! int number;
	int price=100;
	
%>
<% number=287; %>
<br>
<b>Expression: </b>
<%= number %><br>
<b>Price: </b><%=price %><br>
<b>Salary: </b><%= salary %>
<br>
</font>
<jsp:include page="sample.html"></jsp:include>


</body>
</html>