<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PAGE 2</title>
</head>
<body>

	<h1>${result}</h1>

	<h2>Select graduation year:</h2>

	<form action="page2">
		<input type="radio" name="year" value="First Year">	First year<br>
		<input type="radio" name="year" value="Second Year">Second year<br>
		<input type="radio" name="year" value="Third Year">	Third year<br>
		<input type="radio" name="year" value="Fourth Year">Fourth year<br>
		<input type="submit"><br>
	</form>

</body>
</html>