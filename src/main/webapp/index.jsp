<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hero Roster</title>
</head>
<body>

	<h1>Hero Roster</h1>
	<form action="showHeroes" method="get">
		<input type="submit" value="Show Heroes" />
	</form>
	
	<a href="update.jsp  ">Update Hero</a>
	<a href="delete.jsp  ">Delete Hero</a>
	<a href="add.jsp">Add Hero</a>
	<br>
	<br>
	<form action="showTeam" method="get">
		<input type="submit" value="Show Teams" />
	</form>
	
	<a href="updateTeam.jsp">Update Team</a>
	<a href="deleteTeam.jsp">Delete Team</a>
	<a href="addTeam.jsp">Add Team</a>

</body>
</html>