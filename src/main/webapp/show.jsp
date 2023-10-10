<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Heroes</title>
</head>
<body>
	List of all Heroes:
	<table>
		<c:forEach items="${requestScope.allHeroes}" var="currentHero">
			<tr>
				<td>${currentHero.commonName}|</td>
				<td>${currentHero.heroName}|</td>
				<td>${currentHero.power}|</td>
				<td>${currentHero.team.name}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>