<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.util.Date" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num1=10;
int num2=20;
int sum = num1+num2;

%>
<h2> Hello World...!</h2>

<p> Today's date is : <%=new Date() %> </p>

<h2>The sums is <%=sum %></h2>
</body>
</html>