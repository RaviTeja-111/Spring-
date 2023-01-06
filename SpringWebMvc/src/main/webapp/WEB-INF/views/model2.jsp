<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.util.*" %>
    <%@page isELIgnored="false" %>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ModelAndView</title>
</head>
<body>
<%
Object id = request.getAttribute("id");
Object name = request.getAttribute("name");

List<Object> details = (List<Object>)request.getAttribute("details");
%>

<b><%= id %></b>
<h1><%= name %></h1>

<h1>This values are coming from the ModelAndView Object</h1>

<hr>
<h2><b>We can also use Jstl(Jsp Standard tag Library) </b></h2>

<h2>${content}</h2>
<hr>
<%
for(Object d : details){
%>
	<h1><%= d %></h1>
	<% 
}
	

%>

<h2>${details}</h2>
<hr>
<h1>To traverse any loop using Jstl need to add jstl dependency</h1>

<c:forEach var="d" items="${details}">
<h4>${d}</h4>
</c:forEach>

</body>
</html>