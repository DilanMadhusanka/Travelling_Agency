<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

	
	<table border="1" cellpadding="10" align="center">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Country</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td>${contact.name}</td>
				<td>${contact.type}</td>
				<td><img src="${contact.pic}" alt="${contact.name}" width="100"/></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>