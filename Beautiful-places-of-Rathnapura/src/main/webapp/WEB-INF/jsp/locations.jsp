<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations of Rathnapura</title>
<link href="<c:url value="/resources/css/style-locations.css" />" rel="stylesheet"  type="text/css" />

</head>
<body>
	<div class="wrapper">
		<div class="table">
			<table>

					<tr>
					<c:forEach items="${contacts}" var="contact" varStatus="contactCount">
					<c:if test="${(contactCount.count-1) mod 4 eq 0}">
						<tr></tr>
					</c:if>
					<td><img src="${contact.pic}" alt="${contact.name}"/><p>${contact.name}</p>
						<form action="/placeDetails" method="post">
							 <button class="btnShowDetails" value= "${contact.id}" name="name">${contact.type}</button> 
						</form>
					</td>
					</c:forEach>
					</tr>

			</table>
		</div><!-- table -->
	</div><!-- wrapper -->
</body>
</html>