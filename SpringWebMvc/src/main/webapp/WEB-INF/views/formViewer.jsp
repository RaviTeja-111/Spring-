<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Details</title>
</head>
<body>
<b>This is using RequestParam</b>
	<h1>Hai ${name}</h1>
	<h2>You logged in with ${email} </h2>
	<h3>From ${city} city you are ${gender}</h3>
	
	<hr>
	<b>This is using ModelAttribute</b>
	
	<h1>Hai ${user.name}</h1>
	<h2>You logged in with ${user.email} </h2>
	<h3>From ${user.city} city you are ${user.gender}</h3>
</body>
</html>