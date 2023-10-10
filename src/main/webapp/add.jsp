<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Hero</title>
</head>
<body>
<form action="addHero" method="post">
		Team Name:<input
			type="text" name="teamName" size="25"/> 
			
		Common Name: <input
			type="text" name="commonName" size="25"/> 
		
		Hero Name: <input
			type="text" name="heroName" size="25"/> 
		
		Power: <input
			type="text" name="power" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>