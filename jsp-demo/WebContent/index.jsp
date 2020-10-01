<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
	<h2>A Demo</h2>
	<form action = "Servlet" method = "GET">
		<label>
			Username <input type = "text" name = "un">
			Phone Number <input type = "number" name = "ph">
			<br>
			<input type = "submit" value = "submit">
		</label>
	</form>
</body>
</html>