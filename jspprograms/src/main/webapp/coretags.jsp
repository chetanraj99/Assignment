<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Satish Kumar" />
	<p> Hello , <c:out value="${name}"/>
	
	
	<c:if test="${name=='Satish'}" >
		<p>Welcome , Satish </p>
	</c:if>
	
	<c:forEach var="i" begin="1" end="10">
	<h2>Number : ${i}</h2>
	
	</c:forEach>
 
</body>
</html>