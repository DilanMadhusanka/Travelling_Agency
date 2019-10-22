<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style-details.css" />" rel="stylesheet"  type="text/css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>
	<div class="container">
	<div class="card-panel hoverable"></div>
	<h1>${details.topic}</h1>
	<div class="card-panel teal lighten-2"></div>
	<img src="${details.picture}" align="middle"/>
	
	 <blockquote>
     	<p class="flow-text">${details.description}</p>
    </blockquote>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	</div>
</body>
</html>