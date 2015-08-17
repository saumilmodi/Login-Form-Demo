<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img src="images/CA.png" height="100" width="400">
	<h4>Please Enter Following Information To Create Account :</h4>
	<form action="Base" method="post">
	<input type="hidden" name="action" value="CreateAccount">
	<table align="left">
		<tr>
			<td>UserName:</td>
			<td><input type="text" name="UserName"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="Password"></td>
		</tr>
		<tr>
			<td>FirstName:</td>
			<td><input type="text" name="FirstName"></td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="LastName"></td>
		</tr>
		<tr>	
			<td>MobileNumber:</td>
			<td><input type="text" name="MobileNumber"></td>
		</tr>
		<tr>
			<td>Birthdate:</td>
			<td><input type="date" name="Birthdate"></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><select name="Gender">
  				<option value="Male">Male</option>
  				<option value="Female">Female</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Please Enter Recover Pincode :</td>
			<td>
				<input type="text" name="RecoveryPincode">
			</td>
		</tr>
		<tr>
			<td><input type="reset" value="Clear"> <input type="Submit" value="Submit"></td>
		</tr>
</table>
</form>
</body>
</html>