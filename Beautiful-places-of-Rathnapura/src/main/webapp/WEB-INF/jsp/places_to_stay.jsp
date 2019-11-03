<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Places to Stay</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
 <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  
  <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Merienda+One" />
 
 <link href="<c:url value="/resources/css/style-places_to_stay.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
	<div class="wrapper">
		<div class="card" id="card_place">
    		<div class="card-image waves-effect waves-block waves-light">
      			<img class="activator" src="https://images.unsplash.com/photo-1470165301023-58dab8118cc9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80">
    		</div>
    		<div class="card-content">
      			<span class="card-title activator grey-text text-darken-4">Card Title<i class="material-icons right">more_vert</i></span>
      			<p><a href="#">This is a link</a></p>
    		</div>
    		<div class="card-reveal">
      			<span class="card-title grey-text text-darken-4">Card Title<i class="material-icons right">close</i></span>
      			<p>Here is some more information about this product that is only revealed once clicked on.</p>
    		</div>
  		</div>
	</div>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>