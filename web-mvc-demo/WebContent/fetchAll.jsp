<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
	<h3>Users List :-</h3>
	<table>
		<tr>
			<th>User ID</th><th>Name</th><th>Contact</th>
		</tr>
		<core:forEach var="u" items="${listKey}">
			<tr><td>${u.userId}</td><td>${u.name}</td><td>${u.phone}</td></tr>
		</core:forEach>
	</table>
	<hr />
	<a href="login.html"> LOGIN </a>
</body>
</html>