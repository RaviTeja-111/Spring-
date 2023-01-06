<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gurusthan Books</title>
</head>
<body>

	<form action="book_Details" method="post">
		<table>
			
			<tr>
				<td>Book Name :</td>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<td>Author Name :</td>
				<td><input type="text" name="author"></td>
			</tr>
			<tr>
				<td>Rating :</td>
				<td><input type="number" name="rating"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form>

</body>
</html>