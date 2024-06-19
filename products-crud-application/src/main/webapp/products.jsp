<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border=1>
	<tr>
		<th>Product Id</th>
		<th>Description</th>
		<th>Quantity</th>
		<th>Price</th>
	</tr>
	<c:forEach var="p" items="${products}" >
	<tr>
		<td><c:out value="${p.pid}" /></td>
		<td><c:out value="${p.pname}" /></td>
		<td><c:out value="${p.quantity}" /></td>
		<td><c:out value="${p.price}" /></td>

	</tr>
	</c:forEach>
</table>

</body>
</html>