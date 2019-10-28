<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>What to Do</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
 <link href="<c:url value="/resources/css/style-packages.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="card-panel hoverable"></div>
		</div>
		<img class="responsive-img" src="https://miro.medium.com/max/3840/1*uZ8ptB5bqZUGDYRyHkIrAQ.jpeg" id="header-image">
		<div class="table">
		<div class="container">
			<table>
        		<thead>
          			<tr>
              			<th>Package Number</th>
              			<th>Short Description</th>
              			<th>Package Price</th>
          			</tr>
        		</thead>

        		<tbody>
          			<tr>
            			<td>TRL 001</td>
            			<td>Only give the guidance</td>
            			<td>LKR 20000</td>
          			</tr>
          			<tr>
            			<td>TRL 002</td>
            			<td>Give visitor's meals with our guidance</td>
            			<td>LKR 50000</td>
          			</tr>
          			<tr>
            			<td>TRL 003</td>
            			<td>Give the different adventure & funny activities in addition above packages</td>
            			<td>LKR 100000</td>
          			</tr>
        		</tbody>
      		</table>
		</div>
			 
		</div>
	</div>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>