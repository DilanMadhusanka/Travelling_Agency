<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check your own details</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="<c:url value="/resources/css/style-check_details.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
	<div class="wrapper">
		<form action="/checkOwnDetails" method="post">
			<div class="row">
    			<div class="input-field col s12">
      				<input id="first_name2" type="text" class="validate" name="first_name">
      				<label class="active" for="first_name2">First Name</label>
    			</div>
  			</div>
  			<div class="row">
        		<div class="input-field col s12">
          			<input id="password" type="password" class="validate" name="password">
          			<label for="password">Password</label>
        		</div>
      		</div>
      		<div class="error_msg">
      			<p>${errorMessage}</p>
      		</div>
      		<button class="btn waves-effect waves-light" type="submit" name="action" id="btn_search">Submit
    			<i class="material-icons right">send</i>
  			</button>
		</form>
		<center><a class="waves-effect deep-orange lighten-5 btn-small" href="/" id="back_home">&lt;&lt; Back to Home</a></center>
	</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>