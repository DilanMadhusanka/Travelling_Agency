<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Pacifico" />
<link href="<c:url value="/resources/css/style-registration.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
	<div class="header">
		<h1>Register for Agency</h1>
	</div>
	<div class="card" id="form">
		<div class="successMessage">
			<p>${successMessage}</p>
		</div>
		 <div class="row">
    		<form class="col s12" action="/guideHelp" method="post">
      			<div class="row">
        			<div class="input-field col s6">
          				<input id="first_name" type="text" class="validate" name="fname" value="${firstName}" required>
          				<label for="first_name">First Name</label>
        			</div>
        			<div class="input-field col s6">
          				<input id="last_name" type="text" class="validate" name="lname" value="${lastName}" required>
          				<label for="last_name">Last Name</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="nationalId" type="text" class="validate" name="id" value="${national_id}" required>
          				<label for="nationalId">National Identity card Number</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="address" type="text" class="validate" name="address" value="${address}" required>
          				<label for="address">Address</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="reservation" type="text" class="validate" name="d_of_reser" value="${date_res}" required>
          				<label for="reservation">Date for your Reservation</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="team" type="text" class="validate" name="team" value="${num_of_team}" required>
          				<label for="team">Number of members of your team</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s6">
          				<input id="mobileNum" type="text" class="validate" name="mob_num" value="${mob_num}" required>
          				<label for="mobileNum">Mobile Number</label>
        			</div>
        			<div class="input-field col s6">
          				<input id="email" type="email" class="validate" name="email" value="${email}" required>
          				<label for="email">Email</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="input-field col s12">
          				<input id="password" type="password" class="validate" name="password" value="${password}" required>
          				<label for="password">Password</label>
        			</div>
      			</div>
      			<div class="row">
        			<div class="col s12">
          				Package to prefer to get :
          				<div class="input-field inline">
            				<input id="package" type="text" class="validate" name="pack" value="${package_num}" required>
            				<label for="package">Package</label>
            				<span class="helper-text" data-error="wrong" data-success="right">To find the package number visit Things to Do</span>
          				</div>
        			</div>
      			</div>
      			<button type="submit" class="btn btn-secondary btn-lg btn-block" id="btnRegister">Register to Agency</button>
    		</form>
  		</div>
  		<div class="details_check">
      		<a href="/checkOwnDetails" id="check">Check your details &#8811;&#8811;</a>
      	</div>
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>