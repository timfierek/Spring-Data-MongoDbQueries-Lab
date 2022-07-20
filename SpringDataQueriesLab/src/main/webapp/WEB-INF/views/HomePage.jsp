<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search For Hotels</title>
</head>
<body>
	<h1>Hotel Search</h1>
	
	<p>City</p>
	
	<form action="/submitsearch" method="post">
		<select name="city">
			<option value="Detroit">Detroit</option>
			<option value="Mollymook">Mollymook</option>
			<option value="Denver">Denver</option>
			<option value="Monaco">Monaco</option>
		</select><br><br>
	
		<input type="submit" value="Go!"/>
	</form>
</body>
</html>