<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged In</title>
</head>
<body>
	<h3>Welcome</h3>
	<p>Id: ${userKey.userId}, Name : ${userKey.name}</p>
	<p>Phone: ${userKey.phone}, Password : ${userKey.password}</p>
	<hr />
	<a href="updatePhone.html">Update Contact</a>
	<a href="updatePassword.html">Update Password</a>
	<a href="fetch.html">Fetch an User</a>
</body>
</html>