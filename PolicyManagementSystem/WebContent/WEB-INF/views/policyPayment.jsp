<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Policy Payment</h1>

  <form id="policyPayment" modelAttribute="policyPayment" method="post">
     <table align="center">
       <tr>
           <td>Policy Id</td>
           <td><input type="text" name="policyId"></td>
       </tr>
       <tr>
           <td>Bill Date</td>
           <td><input type="text" name="billDate"></td>      
       </tr>
       <tr>
           <td>Due Date</td>
           <td><input type="text" name="dueDate"></td>
       </tr>
       <tr>
           <td>Payment Amount</td>
           <td><input type="text" name="amount" ></td>
       </tr>
       <tr>
           <td>Fine</td>
           <td><input type="text" name="fine" ></td>
       </tr>
       
       <tr>
           <td></td>
           <td><input type="submit" Value="Payment"></td>
       </tr>
      
      </table>
    </form>
</body>
</html>