<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Teams</title>
</head>
<body>
	List of all teams and heroes:
	<table>
		<c:forEach items="${requestScope.allTeams}" var="currentTeam">
			<tr>
				<td>${currentTeam.name}|</td>
				<td>${currentTeam.affiliation}</td>
				
			</tr>
			<c:forEach items="${currentTeam.heroes}" var="currentHero">
					<tr>
						<td>${currentHero.commonName}|</td>
						<td>${currentHero.heroName}|</td>
						<td>${currentHero.power}</td>
					</tr>
				</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>