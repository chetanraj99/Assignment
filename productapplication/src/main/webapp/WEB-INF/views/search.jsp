<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center" style="color:blue" >Product Dashboard</h2>
<jsp:directive.include file = "menu.jsp" /> <br><br><br>
<form action="searchProduct">
<div align="center">
Enter Product Id <input type="text" name="pid" />
<input type="submit" value="search" />
</div>
</form>
<jsp:directive.include file = "footer.jsp" /> 
</body>
</html>