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
<jsp:directive.include file = "menu.jsp" /> 

<h3 align="center" style="color:purple">Product Registration</h3>
<form action="addProduct">
<table border="1" align="center">
	<tr>
		<td>Enter Product Id</td>
		<td><input type="text" name="pid" /></td>
	</tr>
	<tr>
		<td>Enter Product Name</td>
		<td><input type="text" name="pname" /></td>
	</tr>
	<tr>
		<td>Enter Product Quantity</td>
		<td><input type="text" name="quantity" /></td>
	</tr>
	<tr>
		<td>Enter Product Price</td>
		<td><input type="text" name="price" /></td>
	</tr>
</table>
<div align="center"><input type="submit" value="Add Product" /></div>
</form>

<jsp:directive.include file = "footer.jsp" /> 

</body>
</html>