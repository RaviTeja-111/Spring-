<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<b>${Header }</b>
	<%
	Object id = request.getAttribute("id");
	Object name = request.getAttribute("name");
	%>
	<h1><%=id%></h1>
	<h1><%=name%></h1>
	<h2>We are displaying values using Model object</h2>
</body>
</html>