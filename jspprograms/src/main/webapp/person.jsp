<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page import= "jspprograms.Person" %>
  <jsp:useBean id="person" class="jspprograms.Person" scope="session" />
  <jsp:setProperty name="person" property="name" value="Mahesh" />
  <jsp:setProperty name="person" property="age" value="55" />
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Person p = new Person();

%>

<h2>Name of the Person : <%=p.getName() %></h2>
<h2>Age of the Person : <%=p.getAge() %></h2>
<h2> Person Deatails are: </h2>
<p>Name : <jsp:getProperty property="name" name="person"/> </p>
<p>Age :<jsp:getProperty property="age" name="person" /> </p>
</body>
</html>