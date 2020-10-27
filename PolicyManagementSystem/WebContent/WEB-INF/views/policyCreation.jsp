<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Creation</title>
<style type="text/css">
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
	width: 200px;
	height: 4px;  
  }
  </style>
</head>
<body>
<form action="./policyEdit" method="post">
<h1>Policy Creation/Registration</h1>
<table style="margin-left:auto; margin-right: auto;">
		<tr>
		<tr>
           <td>Policy Id</td>
           <td><input type="text" name="policyId" required="required" id="corner"></td>
       </tr>
           <td>Policy Type</td>
           <td><select name="policyType">
               <option value="public">Public Policy</option>
               <option value="privacy">Privacy Policy</option>
               <option value="education">Education Policy</option>
               <option value="health">Health Policy</option> 
               <option value="transport">Transport Policy</option> </select></td>      
       </tr>
       <tr>
           <td>Policy Name</td>
           <td><input type="text" name="policyName" required="required" id="corner"></td>
       </tr>
       <tr>
           <td>Policy Duration</td>
           <td><input type="number" min="1" max="20" value="1" id="corner">years</td>
       </tr>
       <tr>
           <td>Policy Due Date</td>
           <td><input type="text" name="policyDueDate" required="required" id="corner"></td>
       </tr>
       <tr>
           <td>Provider Name</td>
           <td><input type="text" name="companyName" required="required" id="corner"></td>
       </tr>
       <tr>
           <td>Policy Amount</td>
           <td><input type="text" name="policyAmount" required="required" id="corner"></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" Value="Create Policy" style="font-size: 15pt"></td>
       </tr>
		</table>
			</form>

</body>
</html>