<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<div class= "container mt-5"; style="color: Green; border: 1px solid">
		<form action="formDetails" method="post">
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" placeholder="Enter Your Name"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" placeholder="Enter Your Email"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" placeholder="Use Strong password"></td>
				</tr>
				<tr>
					<td>City :</td>
					<td><select name="city">
							<option>Select</option>
							<option>Vijayawada</option>
							<option>Hyderabad</option>
							<option>Machilipatnam</option>
							<option>Gudivada</option>
					</select></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><input type="radio" name="gender" value="Male">Male 
					 <input	type="radio" name="gender" value="Female">Female</td>
				</tr>
				<tr><td><input type="submit" value="Submit"></td></tr>
				

			</table>
		</form>

	</div>
</body>
</html>