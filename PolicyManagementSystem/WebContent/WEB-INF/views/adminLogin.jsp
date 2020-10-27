<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
body {
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
  }
h1{
	text-align:center;
	color:rgb(83, 172, 83);
	padding:20px;
}
  #corner {
	border-radius: 20px;
	border: 2px solid #213bad;
	padding: 20px; 
	width: 150px;
	height: 100px;  
  }
</style>

</head>
<body style="text-align:center;">
	
	<form action="./policyCreation" method="post">
	<h1>Admin Login</h1>
		<div>
			<table style="margin-left:auto; margin-right: auto;">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName" required style="font-size: 10pt; height: 5px; width:200px;" id="corner"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required style="font-size: 10pt; height: 5px; width:200px;" id="corner"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit" class="button" style="font-size: 15pt;">Login</button></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="${pageContext.request.contextPath}/adminRegistration">New
							Registration?</a></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>