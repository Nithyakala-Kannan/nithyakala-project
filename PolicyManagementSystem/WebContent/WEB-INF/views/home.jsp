<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration and Login details</title>
<style type="text/css">
header {
	width: 98%;
	height:35%;
	background-color: rgb(156, 156, 170);
	color: white;
	border-radius: 10px;
	padding: 5px;
	text-align: center;
}
body{
	margin:0;
	padding:0;
	background-color:rgb(245, 248, 230);
	font-family:sans-serif;
}
h3,h1{
	text-align:center;
	color:rgb(83, 172, 83);
	padding:20px;
}
a{
	background-color:rgb(216, 240, 128);
    font-size:200 px;
    text-decoration:none;
}
</style>

</head>
<body style="text-align: center;">
	<header>
		<h1 style="color: rgb(247, 240, 240);">Welcome to Policy
			Management System</h1>
	</header>
	<br><br><br>
	<div>
	<a href="${pageContext.request.contextPath}/userLogin/" style="font-size:x-large;">User</a>
	<br><br>
	<a href="${pageContext.request.contextPath}/adminLogin" style="font-size:x-large;">Admin </a>
	</div>
	<article class="browser">
		<h3>Policy Management has been easier. Discover the
			solution designed with your compliance needs in mind.</h3>
	</article>

	<footer>
		<p>
			For any information<br> <a href="mailto:policymanagement@example.com">policymanagement@example.com</a>
		</p>
	</footer>
</body>
</html>