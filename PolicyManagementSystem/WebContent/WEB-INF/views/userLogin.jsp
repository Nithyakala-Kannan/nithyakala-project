<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
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
<body>
	<h1>User Login</h1>
	<form action="./searchPolicy" method="post">
		<table style="margin-left: auto; margin-right: auto;">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName"
					style="font-size: 10pt; height: 5px; width: 200px;" id="corner"
					required="required"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="required"
						style="font-size: 10pt; height: 5px; width: 200px;" id="corner"></td>
			</tr>
			<tr>
				<td></td>
				<td><input
						type="submit" value="Login" name="login" style="font-size: 15pt;"></a></td>
			</tr>
               <br>
			<tr>
				<td></td>
				<td><a
					href="${pageContext.request.contextPath}/userRegistration">Not
						Registered?</a></td>
			</tr>
		</table>
	</form>


</body>
</html>