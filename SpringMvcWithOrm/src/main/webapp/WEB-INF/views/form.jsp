<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action="formDetails" method="post">
		<table>
			<tr>
				<td>Person Id :</td>
				<td><input type="number " name="id"></td>
			</tr>
			<tr>
				<td>Person Name :</td>
				<td><input type="text" name="pName"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><select name="city">
						<option>Select</option>
						<option>Vijayawada</option>
						<option>Hyderabad</option>
						<option>Machilipatnam</option>
						<option>Gudivada</option>
						<option>Guntur</option>
				</select></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="Male">Male
					<input type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="number" name="phNo" maxlength="10"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form>

</body>
</html>