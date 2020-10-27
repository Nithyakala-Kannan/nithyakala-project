<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1> Search Policy</h1>
   <form id="policyRegister" method="post">
     <table style="text-align:center; margin-left:auto; margin-right:auto;">
       <tr>
           <td>Policy Id</td>
           <td><select name="policyType" id="policyId">
               <option value="policyId"></option></select></td>
       </tr>
       <tr>
           <td>Policy Type</td>
           <td><select name="policyType" id="policyType">
               <option value="policyType"></option> </select></td>      
       </tr>
       <tr>
           <td>Policy Name</td>
           <td><select name="policyName" id="policyName">
               <option value="policyName"></option></select></td>
       </tr>
       <tr>
           <td>Policy Duration</td>
           <td><select name="policyDue" id="policyDue">
               <option value="policyDue"></option> </select></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" Value="Search Policy"></td>
       </tr>
      
      </table>
      <a href="${pageContext.request.contextPath}/policyPayment" style="text-align:center">Policy Payment</a></td>
    </form>
</body>
</html>