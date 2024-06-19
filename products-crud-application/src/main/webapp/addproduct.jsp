<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:9090/products-crud-application/AddProductServlet" >
<table border=1>
	<tr>
		<td>Product Id</td>
		<td><input type="text" name="pid" /></td>
	</tr>
	<tr>
		<td>Description</td>
		<td><input type="text" name="pname" /></td>
		
	</tr>
	<tr>	
		<td>Quantity</td>
		<td><input type="text" name="quantity" /></td>
	</tr>
	
	<tr>	
		<td>Price</td>
		<td><input type="text" name="price" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Add Product" /></td>
	</tr>
</table>
</form>
</body>
</html>