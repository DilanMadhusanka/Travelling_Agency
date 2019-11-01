<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check your own details</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
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
      		<button class="btn waves-effect waves-light" type="submit" name="action" id="search">Submit
    			<i class="material-icons right">send</i>
  			</button>
		</form>
	</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>