<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged In</title>
</head>
<body>
	<h3>Welcome ${profileKey.name}!!</h3>
	<p>Profile Id: ${profileKey.profileId}, Name : ${profileKey.name}, Phone : ${profile.phone}</p>
	<p>Password : ${profilKey.password}, DOB : ${profileKey.dob}</p>
	<hr>
	<h5>Account Details</h5>
	<a href="UpdatePhone.html">Update Phone Number</a>
	<a href="UpdatePassword.html">Update Password</a>
	<a href="AddContact.html">Add Contact</a>
	<a href="UpdateContactDetails">Update Contact</a>
	<hr>
</body>
</html>