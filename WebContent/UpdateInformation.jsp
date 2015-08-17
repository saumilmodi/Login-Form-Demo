<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.bean.Customer" %>
 <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Hello <%=application.getAttribute("UserName")%><br><br><br> Please Click on Submit After Updating information</h4>
	<br><br>
	<%String message=request.getParameter("msg"); %>
	<%if(message!=null){
		out.println(message);}
	%>	
		<%List<Customer> list=(List<Customer>)request.getAttribute("CustomerList"); %>
		<%for(Customer customer:list)
		{%>
	<form method="post" action="Base">
	<input type="hidden" name="action" value="UpdateInformation"/>
	
	<input type="hidden" name="UserName" value="<%=customer.getUserName()%>"/>
	<table align="left">
		<tr>
			<td>UserName:</td>
			<td><input type="text" name="UserName" disabled="disabled" value="<%=customer.getUserName()%>"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="text" name="Password" value="<%=customer.getPassword()%>"></td>
		</tr>
		<tr>
			<td>FirstName:</td>
			<td><input type="text" name="FirstName" value="<%=customer.getFirstName()%>"></td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="LastName" value="<%=customer.getLastName()%>"></td>
		</tr>
		<tr>	
			<td>MobileNumber:</td>
			<td><input type="text" name="MobileNumber" value="<%=customer.getMobileNumber()%>"></td>
		</tr>
		<tr>
			<td>Birthdate:</td>
			<td><input type="date" name="Birthdate" value="<%=customer.getBirthdate()%>"></td>
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
				<input type="text" name="RecoveryPincode" value="<%=customer.getRecoveryPincode()%>">
			</td>
		</tr>
		<tr>
			<td><input type="Submit" value="Submit"></td>
		</tr>
</table>
<%} %>

</form>
</body>
</html>