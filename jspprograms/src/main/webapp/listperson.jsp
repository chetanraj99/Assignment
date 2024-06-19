<%@ page import="java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="jspprograms.Person"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Person> persons = new ArrayList();
	persons.add(new Person("Anil", 50));
	persons.add(new Person("Kishore", 25));
	persons.add(new Person("Mahesh", 56));
	persons.add(new Person("Sunil", 32));
	persons.add(new Person("Chandra", 27));
	request.setAttribute("persons", persons);
	%>
<table border=1>
	<tr>
		<th>Name</th>
		<th>Age</th>
	</tr>
	<c:forEach var="p" items="${persons}" >
	<tr>
		<td><c:out value="${p.getName()}" /></td>
		<td><c:out value="${p.getAge()}" /></td>

	</tr>
	</c:forEach>
</table>
</body>
</html>