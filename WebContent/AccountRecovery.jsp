<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bean.CustomerRecovery"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Please Enter Your UserName and Answer for Security Question to Retrive Passowrd</h4>
	<form method="post" action="Base">
	<input type="hidden" name="action" value="AccountRecovery"/>
	<table>		
		
		<tr>
			<td>What is your username? :</td>
			<td>
				<input type="text" name="UserName">
			</td>
		</tr>
		<tr>
			<td>Please Enter Recover Pincode :</td>
			<td>
				<input type="text" name="RecoveryPincode">
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" style="background-color:#4B0082;color:white"></td>
		</tr>
	</table>
	</form>
</body>
</html>