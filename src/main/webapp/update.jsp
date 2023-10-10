<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Hero</title>
</head>
<body>


	<form action="updateHero" method="post">
		New Common Name: <input type="text" name="commonName" size="25" />
		New Hero Name: <input type="text" name="heroName" size="25" /> 
		New Power: <input type="text" name="power" size="25" />
		New Team Name: <input type="text" name="teamName" size="25" /> <br>
		<br>
		Enter the current Hero name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>