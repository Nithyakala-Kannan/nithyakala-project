<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
body {
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
  }
h1,h3{
	text-align:center;
	color:rgb(83, 172, 83);
	padding:20px;
}
	#corner {
	border-radius: 20px;
	border: 2px solid #;
	padding: 20px; 
	width: 150px;
	height: 4px;  
  }

</style>
</head>
<body>
	<form action="./userRegister" method="post" >
	<h3>User Registration</h3>
		<table
			style="text-align: 'center'; margin-left: auto; margin-right: auto">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" required id="corner"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" required id="corner"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" required id="corner"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male" required>Male
					<input type="radio" name="gender" value="female"
					required="required">Female</td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="contactNumber" required="required" id="corner"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" required="required" id="corner"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="required" id="corner"></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit" style="font-size: 15pt">Register</button></td>
			</tr>

		</table>
	</form>
</body>
</html>