<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Search Results</title>
</head>
<body>
	<h1>Hotels in ${city}</h1>
	
	<c:forEach var="hotel" items="${results}">
		<div class="listing">
			<h3>${hotel.name}</h3>
			<p>Price per night: $${hotel.pricePerNight}</p><br>
		</div>
	</c:forEach>
	
	<a href="/">Start a new Search</a>
</body>
</html>