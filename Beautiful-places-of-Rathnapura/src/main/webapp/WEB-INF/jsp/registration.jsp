<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style-registration.css" />" rel="stylesheet"  type="text/css" />
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="header">
		<h1>Register for Agency</h1>
	</div>
	<div class="card" id="form">
		 <div class="row">
    		<form class="col s12">
      			<div class="row">
        			<div class="input-field col s6">
          				<input id="last_name" type="text" class="validate">
          				<label for="last_name">First Name</label>
        			</div>
        			<div class="input-field col s6">
          				<input id="last_name" type="text" class="validate">
          				<label for="last_name">Last Name</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="email" type="email" class="validate">
          				<label for="email">Address</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="password" type="password" class="validate">
          				<label for="password">Password</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="email" type="email" class="validate">
          				<label for="email">Email</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="col s12">
          				This is an inline input field:
          				<div class="input-field inline">
            				<input id="email_inline" type="email" class="validate">
            				<label for="email_inline">Email</label>
            				<span class="helper-text" data-error="wrong" data-success="right">Helper text</span>
          				</div>
        			</div>
      			</div>
      			<button type="button" class="btn btn-secondary btn-lg btn-block" id="btnRegister">Block level button</button>

    		</form>
  		</div>
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>